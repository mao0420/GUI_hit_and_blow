import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.util.*;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ContentsTest {
    private static FrameFixture window;

    @BeforeEach
    public void setUp() {
        Contents frame = GuiActionRunner.execute(Contents::new);
        window = new FrameFixture(frame);
        window.show();
    }

    @AfterEach
    public void tearDown() {
        window.cleanUp();
    }

    //ゲーム説明画面 文言確認テスト
    @Test
    void testTitleScreenTransitionGameScreen() {
        window.button(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION).click();
        assertEquals(Constants.DISPLAY_TEXT_RULE_DESCRIPTION, Constants.TEST_DISPLAY_TEXT_RULE_DESCRIPTION);
    }

    //ゲーム画面 数値入力テスト
    @Test
    void testGameScreenNumberInput() {
        //0～9格納用のリストを作成
        ArrayList<String> testNumber = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            //0～9の数を1つずつリストに格納。
            testNumber.add(String.valueOf(i));
        }
        //リストに格納した0～9の数をシャッフルする。
        Collections.shuffle(testNumber);
        String testInputDigitsOne = testNumber.get(0);
        String testInputDigitsTwo = testNumber.get(1);
        String testInputDigitsThree = testNumber.get(2);
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(testInputDigitsOne).click();
        window.button(testInputDigitsTwo).click();
        window.button(testInputDigitsThree).click();
        assertEquals(GameScreenPanel.labelOneDigits.getText(), testInputDigitsOne);
        assertEquals(GameScreenPanel.labelTwoDigits.getText(), testInputDigitsTwo);
        assertEquals(GameScreenPanel.labelThreeDigits.getText(), testInputDigitsThree);
    }

    //ゲーム画面 リセットボタンテスト
    @Test
    void testGameScreenInputReset() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_INPUT_NUMBER_TWO).click();
        window.button(Constants.TEST_INPUT_NUMBER_THREE).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_RESET).click();
        assertEquals(GameScreenPanel.labelOneDigits.getText(), Constants.TEST_DISPLAY_NUMBER_NOT_INPUT);
        assertEquals(GameScreenPanel.labelTwoDigits.getText(), Constants.TEST_DISPLAY_NUMBER_NOT_INPUT);
        assertEquals(GameScreenPanel.labelThreeDigits.getText(), Constants.TEST_DISPLAY_NUMBER_NOT_INPUT);
    }

    //ゲーム画面 履歴保存テスト
    @Test
    void testGameScreenInputHistory() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        String[][] testHistory = new String[9][Constants.CONSTANT_DIGIT_NUMBER];
        //0～9格納用のリストを作成
        ArrayList<String> testNumber = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            //0～9の数を1つずつリストに格納。
            testNumber.add(String.valueOf(i));
        }
        for (int i = 0; i < 9; i++) {
            Collections.shuffle(testNumber);
            testHistory[i][0] = testNumber.get(0);
            testHistory[i][1] = testNumber.get(1);
            testHistory[i][2] = testNumber.get(2);
            GameScreenPanel.labelOneDigits.setText(testNumber.get(0));
            GameScreenPanel.labelTwoDigits.setText(testNumber.get(1));
            GameScreenPanel.labelThreeDigits.setText(testNumber.get(2));
            window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        }
        assertThat(GameScreenPanel.labelInputHistoryNumberOne.getText()).matches(Pattern.compile("\\[" + testHistory[0][0] + ", " + testHistory[0][1] + ", " + testHistory[0][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberTwo.getText()).matches(Pattern.compile("\\[" + testHistory[1][0] + ", " + testHistory[1][1] + ", " + testHistory[1][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberThree.getText()).matches(Pattern.compile("\\[" + testHistory[2][0] + ", " + testHistory[2][1] + ", " + testHistory[2][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberFour.getText()).matches(Pattern.compile("\\[" + testHistory[3][0] + ", " + testHistory[3][1] + ", " + testHistory[3][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberFive.getText()).matches(Pattern.compile("\\[" + testHistory[4][0] + ", " + testHistory[4][1] + ", " + testHistory[4][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberSix.getText()).matches(Pattern.compile("\\[" + testHistory[5][0] + ", " + testHistory[5][1] + ", " + testHistory[5][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberSeven.getText()).matches(Pattern.compile("\\[" + testHistory[6][0] + ", " + testHistory[6][1] + ", " + testHistory[6][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberEight.getText()).matches(Pattern.compile("\\[" + testHistory[7][0] + ", " + testHistory[7][1] + ", " + testHistory[7][2] + "]:[0-3]:[0-3]"));
        assertThat(GameScreenPanel.labelInputHistoryNumberNine.getText()).matches(Pattern.compile("\\[" + testHistory[8][0] + ", " + testHistory[8][1] + ", " + testHistory[8][2] + "]:[0-3]:[0-3]"));
    }

    //ゲーム画面 未入力エラーメッセージテスト
    @Test
    void testGameScreenNotInputErrorMessage() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        assertEquals(GameScreenPanel.labelErrorMessage.getText(), Constants.TEST_DISPLAY_TEXT_ERROR_NOT_INPUT_MESSAGE);
    }

    //ゲーム画面 重複エラーメッセージテスト
    @Test
    void testGameScreenDuplicationErrorMessage() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        assertEquals(GameScreenPanel.labelErrorMessage.getText(), Constants.TEST_DISPLAY_TEXT_ERROR_DUPLICATION_MESSAGE);
    }

    //ゲーム画面 正常入力時エラーメッセージ消去テスト
    @Test
    void testGameScreenErrorMessageErasure() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_INPUT_NUMBER_TWO).click();
        window.button(Constants.TEST_INPUT_NUMBER_THREE).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        assertEquals(GameScreenPanel.labelErrorMessage.getText(), Constants.TEST_DISPLAY_TEXT_INPUT_SPACE);
    }

    //ゲーム画面 ギブアップ選択時テキスト確認テスト
    @Test
    void testGameScreenInputGiveUp() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_GIVE_UP).click();
        assertEquals(GameOverPanel.labelResult.getText(), String.format(Constants.TEST_DISPLAY_TEXT_GAME_OVER_RESULT, Arrays.toString(Contents.answer)));
    }

    //ゲーム画面 ゲームオーバーテキスト確認テスト
    @Test
    void testGameScreenGameOverTransition() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        Contents.tryTimes = Constants.TEST_TRY_TIMES_GAME_OVER;
        window.button(Constants.TEST_INPUT_NUMBER_ONE).click();
        window.button(Constants.TEST_INPUT_NUMBER_TWO).click();
        window.button(Constants.TEST_INPUT_NUMBER_THREE).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        assertEquals(GameOverPanel.labelResult.getText(), String.format(Constants.TEST_DISPLAY_TEXT_GAME_OVER_RESULT, Arrays.toString(Contents.answer)));
    }

    //ゲーム画面 ゲームクリアテキスト確認テスト
    @Test
    void testGameScreenGameClearTransition() {
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(String.valueOf(Contents.answer[0])).click();
        window.button(String.valueOf(Contents.answer[1])).click();
        window.button(String.valueOf(Contents.answer[2])).click();
        window.button(Constants.TEST_DISPLAY_BUTTON_CONFIRM).click();
        assertEquals(GameClearPanel.labelResult.getText(), String.format(Constants.TEST_DISPLAY_TEXT_GAME_CLEAR_RESULT, Arrays.toString(Contents.answer), Contents.tryTimes));
    }

    // @Ruleアノテーションと共に、ExpectedSystemExitクラスのインスタンス作成
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void testGameScreenGameEnd() {
        window.button(Constants.DISPLAY_BUTTON_GAME_END).click();
        exit.expectSystemExitWithStatus(0);
    }

    //正解数値設定テスト
    @Test
    void testCorrectAnswerNumber() {
        int[] actual = Contents.correctAnswerNumber();
        assertNotEquals(actual[0], actual[1]);
        assertNotEquals(actual[0], actual[2]);
        assertNotEquals(actual[1], actual[2]);
        assertEquals(Constants.TEST_ELEMENT_DIGITS, actual.length);
    }

    //ヒットブロー計算メソッド ヒット数0テスト
    @Test
    void testGetHitBlowHit0() {
        int expect = Constants.TEST_HIT_ZERO;
        int[] answer = {0, 1, 2};
        int[] input = {3, 4, 5};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数1テスト
    @Test
    void testGetHitBlowHit1() {
        int expect = Constants.TEST_HIT_ONE;
        int[] answer = {0, 1, 2};
        int[] input = {0, 3, 4};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数2テスト
    @Test
    void testGetHitBlowHit2() {
        int expect = Constants.TEST_HIT_TWO;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 3};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数3テスト
    @Test
    void testGetHitBlowHit3() {
        int expect = Constants.TEST_HIT_THREE;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 2};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数0テスト
    @Test
    void testGetHitBlowBlow0() {
        int expect = Constants.TEST_BLOW_ZERO;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 2};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数1テスト
    @Test
    void testGetHitBlowBlow1() {
        int expect = Constants.TEST_BLOW_ONE;
        int[] answer = {0, 1, 2};
        int[] input = {2, 3, 4};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数2テスト
    @Test
    void testGetHitBlowBlow2() {
        int expect = Constants.TEST_BLOW_TWO;
        int[] answer = {0, 1, 2};
        int[] input = {1, 2, 3};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数3テスト
    @Test
    void testGetHitBlowBlow3() {
        int expect = Constants.TEST_BLOW_THREE;
        int[] answer = {0, 1, 2};
        int[] input = {2, 0, 1};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }
}
