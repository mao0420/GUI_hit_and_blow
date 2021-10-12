import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ContentsTest {
    private FrameFixture window;

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

    //ゲーム画面 数値入力テスト
    @Test
    void testGameScreenNumberInput() {
        String[] testCorrect = new String[Constants.CONSTANT_DIGIT_NUMBER];
        //0～9格納用のリストを作成
        ArrayList<Integer> testNumber = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            //0～9の数を1つずつリストに格納。
            testNumber.add(i);
        }
        //リストに格納した0～9の数をシャッフルする。
        Collections.shuffle(testNumber);
        for (int i = 0; i < Constants.CONSTANT_DIGIT_NUMBER; i++) {
            if (testNumber.get(i) == 1) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_ONE;
            } else if (testNumber.get(i) == 2) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_TWO;
            } else if (testNumber.get(i) == 3) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_THREE;
            } else if (testNumber.get(i) == 4) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_FOUR;
            } else if (testNumber.get(i) == 5) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_FIVE;
            } else if (testNumber.get(i) == 6) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_SIX;
            } else if (testNumber.get(i) == 7) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_SEVEN;
            } else if (testNumber.get(i) == 8) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_EIGHT;
            } else if (testNumber.get(i) == 9) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_NINE;
            } else if (testNumber.get(i) == 0) {
                testCorrect[i] = Constants.TEST_INPUT_NUMBER_ZERO;
            }
        }
        String testInputDigitsOne = testCorrect[0];
        String testInputDigitsTwo = testCorrect[1];
        String testInputDigitsThree = testCorrect[2];
        window.button(Constants.DISPLAY_BUTTON_GAME_START).click();
        window.button(testInputDigitsOne).click();
        window.button(testInputDigitsTwo).click();
        window.button(testInputDigitsThree).click();
        assertEquals(GameScreenPanel.labelOneDigits.getText(), testInputDigitsOne);
        assertEquals(GameScreenPanel.labelTwoDigits.getText(), testInputDigitsTwo);
        assertEquals(GameScreenPanel.labelThreeDigits.getText(), testInputDigitsThree);
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
