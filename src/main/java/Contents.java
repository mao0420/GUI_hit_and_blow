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
        JPanel CardTitleScreen = new JPanel();
        CardTitleScreen.setLayout(new BoxLayout(CardTitleScreen, BoxLayout.Y_AXIS));

        JLabel LabelTitleScreenTitle = new JLabel(Constants.DISPLAY_TEXT_TITLE);
        JButton ButtonTitleScreenGameStart = new JButton(Constants.DISPLAY_BUTTON_GAME_START);
        JButton ButtonTitleScreenRuleDescription = new JButton(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        JButton ButtonTitleScreenGameEnd = new JButton(Constants.DISPLAY_BUTTON_GAME_END);

        LabelTitleScreenTitle.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 100));
        ButtonTitleScreenGameStart.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        ButtonTitleScreenRuleDescription.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        ButtonTitleScreenGameEnd.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));

        ButtonTitleScreenGameStart.setPreferredSize(new Dimension(300, 50));
        ButtonTitleScreenRuleDescription.setPreferredSize(new Dimension(400, 50));
        ButtonTitleScreenGameEnd.setPreferredSize(new Dimension(400, 50));

        LabelTitleScreenTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        ButtonTitleScreenGameStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        ButtonTitleScreenRuleDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        ButtonTitleScreenGameEnd.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonTitleScreenRuleDescription.addActionListener(this);
        ButtonTitleScreenRuleDescription.setActionCommand(Constants.CARD_RULE_DESCRIPTION);

        //ゲームクリア画面デバッグ用
        JButton ButtonTitleScreenGameClear = new JButton(Constants.DISPLAY_BUTTON_GAME_CLEAR);
        ButtonTitleScreenGameClear.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        ButtonTitleScreenGameClear.setPreferredSize(new Dimension(300, 50));
        ButtonTitleScreenGameClear.setAlignmentX(Component.CENTER_ALIGNMENT);
        ButtonTitleScreenGameClear.addActionListener(this);
        ButtonTitleScreenGameClear.setActionCommand(Constants.CARD_GAME_CLEAR);

        CardTitleScreen.add(Box.createGlue());
        CardTitleScreen.add(LabelTitleScreenTitle);
        CardTitleScreen.add(Box.createGlue());
        CardTitleScreen.add(Box.createGlue());
        CardTitleScreen.add(ButtonTitleScreenGameStart);
        CardTitleScreen.add(Box.createGlue());
        CardTitleScreen.add(ButtonTitleScreenRuleDescription);
        CardTitleScreen.add(Box.createGlue());
        CardTitleScreen.add(ButtonTitleScreenGameEnd);
        CardTitleScreen.add(Box.createGlue());
        //ゲームクリア画面デバッグ用
        CardTitleScreen.add(ButtonTitleScreenGameClear);

        Container contentPane01 = getContentPane();
        contentPane01.add(CardTitleScreen, BorderLayout.CENTER);

        //ルール説明画面カード
        JPanel CardRuleDescription = new JPanel();
        CardRuleDescription.setLayout(new BoxLayout(CardRuleDescription, BoxLayout.Y_AXIS));

        JLabel LabelRuleDescriptionRule = new JLabel(Constants.DISPLAY_TEXT_RULE_DESCRIPTION);
        JButton ButtonRuleDescriptionBack = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        LabelRuleDescriptionRule.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 18));
        ButtonRuleDescriptionBack.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));

        LabelRuleDescriptionRule.setAlignmentX(Component.CENTER_ALIGNMENT);
        ButtonRuleDescriptionBack.setAlignmentX(Component.RIGHT_ALIGNMENT);

        ButtonRuleDescriptionBack.addActionListener(this);
        ButtonRuleDescriptionBack.setActionCommand(Constants.CARD_TITLE_SCREEN);

        CardRuleDescription.add(Box.createGlue());
        CardRuleDescription.add(LabelRuleDescriptionRule);
        CardRuleDescription.add(Box.createGlue());
        CardRuleDescription.add(ButtonRuleDescriptionBack);
        CardRuleDescription.add(Box.createGlue());

        Container contentPane02 = getContentPane();
        contentPane02.add(CardRuleDescription, BorderLayout.CENTER);

        //ゲームクリア画面カード
        JPanel CardGameClear = new JPanel();
        CardGameClear.setLayout(new BoxLayout(CardGameClear, BoxLayout.Y_AXIS));

        JLabel LabelGameClearResult = new JLabel(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT);
        JButton ButtonGameClearBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        LabelGameClearResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
        ButtonGameClearBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));

        LabelGameClearResult.setAlignmentX(CENTER_ALIGNMENT);
        LabelGameClearResult.setHorizontalAlignment(JLabel.CENTER);
        ButtonGameClearBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonGameClearBackToTitle.addActionListener(this);
        ButtonGameClearBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);

        CardGameClear.add(Box.createGlue());
        CardGameClear.add(LabelGameClearResult);
        CardGameClear.add(Box.createGlue());
        CardGameClear.add(ButtonGameClearBackToTitle);
        CardGameClear.add(Box.createGlue());

        Container contentPane04 = getContentPane();
        contentPane04.add(CardGameClear, BorderLayout.CENTER);

        //カード設定
        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(CardTitleScreen, Constants.CARD_TITLE_SCREEN);
        cardPanel.add(CardRuleDescription, Constants.CARD_RULE_DESCRIPTION);
        cardPanel.add(CardGameClear, Constants.CARD_GAME_CLEAR);

        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        layout.show(cardPanel, cmd);
    }
}