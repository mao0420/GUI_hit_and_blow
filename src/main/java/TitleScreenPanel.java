import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TitleScreenPanel extends JPanel {

    private final JLabel labelTitle;
    private final JButton buttonGameStart;
    private final JButton buttonRuleDescription;
    private final JButton buttonGameEnd;

    /**
     * タイトル画面パネルメソッド
     * タイトル時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public TitleScreenPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        labelTitle = new JLabel(Constants.DISPLAY_TEXT_TITLE);
        buttonGameStart = new JButton(Constants.DISPLAY_BUTTON_GAME_START);
        buttonRuleDescription = new JButton(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        buttonGameEnd = new JButton(Constants.DISPLAY_BUTTON_GAME_END);

        buttonGameStart.setName(Constants.DISPLAY_BUTTON_GAME_START);
        buttonRuleDescription.setName(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        buttonGameEnd.setName(Constants.DISPLAY_BUTTON_GAME_END);

        setFontInTitleScreenPanel();
        buttonSettingsInTitleScreenPanel();
        setAlignmentInTitleScreenPanel();
        setActionInTitleScreenPanel(actionListener);

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
    }

    /**
     * タイトル画面パネル フォント設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInTitleScreenPanel() {
        labelTitle.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, Constants.SIZE_TEXT_TITLE));
        buttonGameStart.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonRuleDescription.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonGameEnd.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * タイトル画面パネル サイズ設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルのサイズを設定する。
     */
    private void buttonSettingsInTitleScreenPanel() {
        buttonGameStart.setPreferredSize(new Dimension(300, 50));
        buttonRuleDescription.setPreferredSize(new Dimension(400, 50));
        buttonGameEnd.setPreferredSize(new Dimension(400, 50));
    }

    /**
     * タイトル画面パネル 配置場所設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInTitleScreenPanel() {
        labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRuleDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameEnd.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * タイトル画面パネル アクション設定メソッド
     * タイトル画面パネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInTitleScreenPanel(ActionListener actionListener) {
        buttonGameStart.addActionListener(actionListener);
        buttonGameStart.setActionCommand(Constants.CARD_GAME_SCREEN);
        buttonRuleDescription.addActionListener(actionListener);
        buttonRuleDescription.setActionCommand(Constants.CARD_RULE_DESCRIPTION);
        buttonGameEnd.addActionListener(actionListener);
        buttonGameEnd.setActionCommand(Constants.BUTTON_GAME_END);
    }
}
