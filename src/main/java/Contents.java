import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Contents extends JFrame implements ActionListener {
    JPanel cardPanel;
    CardLayout layout;

    static int tryTimes = Constants.CONSTANT_TRY_TIMES_COUNT_FORMAT;
    int[] answer = new int[Constants.CONSTANT_DIGIT_NUMBER];
    int[] inputArray = new int[0];

    public static void main(String[] args) {
        Contents frame = new Contents();
        frame.setTitle(Constants.DISPLAY_NAME_FRAME_TITLE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Contents() {
        //タイトル画面カード
        TitleScreenPanel cardTitleScreen = new TitleScreenPanel(this);
        Container contentPane01 = getContentPane();
        contentPane01.add(cardTitleScreen, BorderLayout.CENTER);

        //ゲーム画面カード
        GameScreenPanel cardGameScreen = new GameScreenPanel(this);
        Container contentPane02 = getContentPane();
        contentPane02.add(cardGameScreen, BorderLayout.CENTER);

        //ルール説明画面カード
        RuleDescriptionPanel cardRuleDescription = new RuleDescriptionPanel(this);
        Container contentPane03 = getContentPane();
        contentPane03.add(cardRuleDescription, BorderLayout.CENTER);

        //ゲームクリア画面カード
        GameClearPanel cardGameClear = new GameClearPanel(this);
        Container contentPane04 = getContentPane();
        contentPane04.add(cardGameClear, BorderLayout.CENTER);

        //ゲームオーバー画面カード
        GameOverPanel cardGameOver = new GameOverPanel(this);
        Container contentPane05 = getContentPane();
        contentPane05.add(cardGameOver, BorderLayout.CENTER);

        //カード設定
        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(cardTitleScreen, Constants.CARD_TITLE_SCREEN);
        cardPanel.add(cardGameScreen, Constants.CARD_GAME_SCREEN);
        cardPanel.add(cardRuleDescription, Constants.CARD_RULE_DESCRIPTION);
        cardPanel.add(cardGameClear, Constants.CARD_GAME_CLEAR);
        cardPanel.add(cardGameOver, Constants.CARD_GAME_OVER);

        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals(Constants.CARD_GAME_SCREEN)) {
            //ゲーム開始ボタンクリック時
            layout.show(cardPanel, cmd);
            answer = correctAnswerNumber();
            tryTimes = Constants.CONSTANT_TRY_TIMES_COUNT_FORMAT;
            String setTryTimes = String.format(Constants.DISPLAY_TEXT_INPUT_TIMES, tryTimes);
            GameScreenPanel.labelInputTimes.setText(setTryTimes);
            GameScreenPanel.labelOneDigits.setText("-");
            GameScreenPanel.labelTwoDigits.setText("-");
            GameScreenPanel.labelThreeDigits.setText("-");
        } else if (cmd.matches("^Card.*")) {
            //その他画面遷移用ボタンクリック時
            layout.show(cardPanel, cmd);
        } else if (cmd.matches("[0-9]")) {
            //ゲーム画面にて0～9ボタンクリック時
            if (!(GameScreenPanel.labelOneDigits.getText().matches("[0-9]"))) {
                GameScreenPanel.labelOneDigits.setText(cmd);
            } else if (!(GameScreenPanel.labelTwoDigits.getText().matches("[0-9]"))) {
                GameScreenPanel.labelTwoDigits.setText(cmd);
            } else {
                GameScreenPanel.labelThreeDigits.setText(cmd);
            }
        } else if (cmd.equals(Constants.DISPLAY_BUTTON_RESET)) {
            //ゲーム画面にてリセットボタンクリック時
            GameScreenPanel.labelOneDigits.setText("-");
            GameScreenPanel.labelTwoDigits.setText("-");
            GameScreenPanel.labelThreeDigits.setText("-");
        } else if (cmd.equals(Constants.DISPLAY_BUTTON_CONFIRM)) {
            //ゲーム画面にて確定ボタンクリック時
            tryTimes = judge(tryTimes, inputArray, answer);
        } else if (cmd.equals(Constants.BUTTON_GAME_END)) {
            //タイトル画面にてゲーム終了ボタンクリック時
            Component c = (Component) e.getSource();
            Window w = SwingUtilities.getWindowAncestor(c);
            w.dispose();
        }
    }

    public static int[] correctAnswerNumber() {
        //正解の数値用の配列、3つの1桁数字を格納する。
        int[] correct = new int[Constants.CONSTANT_DIGIT_NUMBER];
        //0～9格納用のリストを作成
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            //0～9の数を1つずつリストに格納。
            number.add(i);
        }
        //リストに格納した0～9の数をシャッフルする。
        Collections.shuffle(number);
        for (int i = 0; i < correct.length; i++) {
            //シャッフルしたリストを正解の配列の要素数分格納する。
            correct[i] = number.get(i);
        }
        return correct;
    }

    public int judge(int tryTimes, int[] inputArray, int[] answer) {
        //試行回数を履歴用変数に保存
        int temporaryInputTimes = tryTimes;
        //試行回数を1増やす
        tryTimes++;
        String setTryTimes = String.format(Constants.DISPLAY_TEXT_INPUT_TIMES, tryTimes);
        GameScreenPanel.labelInputTimes.setText(setTryTimes);
        //ヒットブロー計算メソッドへ
        int[] hitBlowCounter = getHitBlow(inputArray, answer);
        if (Constants.CONSTANT_HIT_ANSWER_NUMBER == hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER]) {
            //hitが3桁全てである場合はゲームクリアとする。
            layout.show(cardPanel, Constants.CARD_GAME_CLEAR);
            String setGameClearResult = String.format(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT, Arrays.toString(answer), tryTimes);
            GameClearPanel.labelResult.setText(setGameClearResult);
            return tryTimes;
        } else if (Constants.CONSTANT_GAME_OVER_LIMIT == tryTimes) {
            //試行回数が10回目でゲームクリアに到達できない場合はゲームオーバーとする。
            layout.show(cardPanel, Constants.CARD_GAME_OVER);
            String setGameOverResult = String.format(Constants.DISPLAY_TEXT_GAME_OVER_RESULT, Arrays.toString(answer));
            GameOverPanel.labelResult.setText(setGameOverResult);
            return tryTimes;
        }
//        inputHistory[temporaryInputTimes][0] = String.valueOf(tryTimes);
//        inputHistory[temporaryInputTimes][1] = input;
//        inputHistory[temporaryInputTimes][2] = String.valueOf(hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
//        inputHistory[temporaryInputTimes][3] = String.valueOf(hitBlowCounter[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
//        System.out.println(Constants.MESSAGE_LOG_HEADER);
//        for (int k = 0; k < tryTimes; k++) {
//            System.out.printf((Constants.MESSAGE_LOG) + "%n", inputHistory[k][0], inputHistory[k][1], inputHistory[k][2], inputHistory[k][3]);
//        }
//        //再度数値入力メソッドから繰り返す。その際ミスカウントをリセットする。
//        numberEntry(tryTimes, answer, inputHistory, Constants.CONSTANT_NUMBER_ENTRY_MISS_COUNT_RESET);
        GameScreenPanel.labelOneDigits.setText("-");
        GameScreenPanel.labelTwoDigits.setText("-");
        GameScreenPanel.labelThreeDigits.setText("-");
        return tryTimes;
    }

    public static int[] getHitBlow(int[] inputArray, int[] answer) {
        //ヒットのカウンタ初期化
        int hitCounter = Constants.CONSTANT_HIT_COUNT_FORMAT;
        //ブローのカウンタ初期化
        int blowCounter = Constants.CONSTANT_BLOW_COUNT_FORMAT;
        //ヒットとブローの数値を格納する配列の初期化
        int[] hitBlowCounter = new int[2];
        for (int i = 0; i < inputArray.length; i++) {
            //iが3に到達した時ループから脱出する。
            if (inputArray[i] == answer[i]) {
                //ヒットの処理、入力数値と正解数値の同じ桁同士を比較し、数値が同じ場合はヒットを加算する。
                hitCounter++;
            }
            for (int j = 0; j < inputArray.length; j++) {
                //jが3に到達した時ループから脱出し、iのカウンターを増やし再度カウントし直す。
                if (i != j) {
                    //iとjが同数(ヒットと同じ)の場合は無視して次のループへ。
                    if (inputArray[i] == answer[j]) {
                        //ブローの処理、iとjが違う数値(桁の位置が違う)の要素内の数値を比較し、数値が同じ場合はブローを加算する。
                        blowCounter++;
                    }
                }
            }
        }
        //ヒットの数値を格納
        hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER] = hitCounter;
        hitBlowCounter[Constants.CONSTANT_ARRAY_BLOW_COUNTER] = blowCounter;
        return hitBlowCounter;
    }
}