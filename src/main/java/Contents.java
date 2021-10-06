import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contents extends JFrame implements ActionListener {
    JPanel cardPanel;
    CardLayout layout;

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
            layout.show(cardPanel, cmd);
            GameScreenPanel.labelOneDigits.setText("-");
            GameScreenPanel.labelTwoDigits.setText("-");
            GameScreenPanel.labelThreeDigits.setText("-");
        }else if (cmd.matches("^Card.*")) {
            layout.show(cardPanel, cmd);
        } else if (cmd.matches("[0-9]")) {
            if (!(GameScreenPanel.labelOneDigits.getText().matches("[0-9]"))){
                GameScreenPanel.labelOneDigits.setText(cmd);
            } else if (!(GameScreenPanel.labelTwoDigits.getText().matches("[0-9]"))){
                GameScreenPanel.labelTwoDigits.setText(cmd);
            } else {
                GameScreenPanel.labelThreeDigits.setText(cmd);
            }
        } else if (cmd.equals(Constants.DISPLAY_BUTTON_RESET)){
            GameScreenPanel.labelOneDigits.setText("-");
            GameScreenPanel.labelTwoDigits.setText("-");
            GameScreenPanel.labelThreeDigits.setText("-");
        } else if (cmd.equals(Constants.BUTTON_GAME_END)) {
            Component c = (Component) e.getSource();
            Window w = SwingUtilities.getWindowAncestor(c);
            w.dispose();
        }
    }
}