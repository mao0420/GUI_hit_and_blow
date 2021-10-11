import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TitleScreenPanel extends JPanel {

    private final JLabel labelTitle;
    private final JButton buttonGameStart;
    private final JButton buttonRuleDescription;
    private final JButton buttonGameEnd;

    public TitleScreenPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        labelTitle = new JLabel(Constants.DISPLAY_TEXT_TITLE);
        buttonGameStart = new JButton(Constants.DISPLAY_BUTTON_GAME_START);
        buttonGameStart.setName(Constants.DISPLAY_BUTTON_GAME_START);
        buttonRuleDescription = new JButton(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        buttonGameEnd = new JButton(Constants.DISPLAY_BUTTON_GAME_END);

        setFontInTitleScreenPanel();
        buttonSettingsInTitleScreenPanel();
        setAlignmentInTitleScreenPanel();
        setActionInTitleScreenPanel(actionListener);

//        //ゲームクリア画面デバッグ用
//        JButton buttonTitleScreenGameClear = new JButton(Constants.DISPLAY_BUTTON_GAME_CLEAR);
//        buttonTitleScreenGameClear.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
//        buttonTitleScreenGameClear.setPreferredSize(new Dimension(300, 50));
//        buttonTitleScreenGameClear.setAlignmentX(Component.CENTER_ALIGNMENT);
//        buttonTitleScreenGameClear.addActionListener(actionListener);
//        buttonTitleScreenGameClear.setActionCommand(Constants.CARD_GAME_CLEAR);
//
//        //ゲームオーバー画面デバッグ用
//        JButton buttonTitleScreenGameOver = new JButton(Constants.DISPLAY_BUTTON_GAME_OVER);
//        buttonTitleScreenGameOver.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
//        buttonTitleScreenGameOver.setPreferredSize(new Dimension(300, 50));
//        buttonTitleScreenGameOver.setAlignmentX(Component.CENTER_ALIGNMENT);
//        buttonTitleScreenGameOver.addActionListener(actionListener);
//        buttonTitleScreenGameOver.setActionCommand(Constants.CARD_GAME_OVER);

        this.add(Box.createGlue());
        this.add(labelTitle);
        this.add(Box.createGlue());
        this.add(Box.createGlue());
        this.add(buttonGameStart);
        this.add(Box.createGlue());
        this.add(buttonRuleDescription);
        this.add(Box.createGlue());
        this.add(buttonGameEnd);
        this.add(Box.createGlue());
//        //ゲームクリア画面デバッグ用
//        this.add(buttonTitleScreenGameClear);
//        //ゲームオーバー画面デバッグ用
//        this.add(buttonTitleScreenGameOver);
    }

    private void setFontInTitleScreenPanel() {
        labelTitle.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 100));
        buttonGameStart.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonRuleDescription.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonGameEnd.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
    }

    private void buttonSettingsInTitleScreenPanel() {
        buttonGameStart.setPreferredSize(new Dimension(300, 50));
        buttonRuleDescription.setPreferredSize(new Dimension(400, 50));
        buttonGameEnd.setPreferredSize(new Dimension(400, 50));
    }

    private void setAlignmentInTitleScreenPanel() {
        labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRuleDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameEnd.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private void setActionInTitleScreenPanel(ActionListener actionListener) {
        buttonGameStart.addActionListener(actionListener);
        buttonGameStart.setActionCommand(Constants.CARD_GAME_SCREEN);
        buttonRuleDescription.addActionListener(actionListener);
        buttonRuleDescription.setActionCommand(Constants.CARD_RULE_DESCRIPTION);
        buttonGameEnd.addActionListener(actionListener);
        buttonGameEnd.setActionCommand(Constants.BUTTON_GAME_END);
    }
}
