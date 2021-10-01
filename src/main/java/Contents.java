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
        JPanel cardTitleScreen = new JPanel();
        cardTitleScreen.setLayout(new BoxLayout(cardTitleScreen, BoxLayout.Y_AXIS));

        JLabel labelTitleScreenTitle = new JLabel(Constants.DISPLAY_TEXT_TITLE);
        JButton buttonTitleScreenGameStart = new JButton(Constants.DISPLAY_BUTTON_GAME_START);
        JButton buttonTitleScreenRuleDescription = new JButton(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        JButton buttonTitleScreenGameEnd = new JButton(Constants.DISPLAY_BUTTON_GAME_END);

        labelTitleScreenTitle.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 100));
        buttonTitleScreenGameStart.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonTitleScreenRuleDescription.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonTitleScreenGameEnd.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));

        buttonTitleScreenGameStart.setPreferredSize(new Dimension(300, 50));
        buttonTitleScreenRuleDescription.setPreferredSize(new Dimension(400, 50));
        buttonTitleScreenGameEnd.setPreferredSize(new Dimension(400, 50));

        labelTitleScreenTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTitleScreenGameStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTitleScreenRuleDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTitleScreenGameEnd.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonTitleScreenGameStart.addActionListener(this);
        buttonTitleScreenGameStart.setActionCommand(Constants.CARD_GAME_SCREEN);
        buttonTitleScreenRuleDescription.addActionListener(this);
        buttonTitleScreenRuleDescription.setActionCommand(Constants.CARD_RULE_DESCRIPTION);
        buttonTitleScreenGameEnd.addActionListener(this);
        buttonTitleScreenGameEnd.setActionCommand(Constants.BUTTON_GAME_END);

        //ゲームクリア画面デバッグ用
        JButton buttonTitleScreenGameClear = new JButton(Constants.DISPLAY_BUTTON_GAME_CLEAR);
        buttonTitleScreenGameClear.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonTitleScreenGameClear.setPreferredSize(new Dimension(300, 50));
        buttonTitleScreenGameClear.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTitleScreenGameClear.addActionListener(this);
        buttonTitleScreenGameClear.setActionCommand(Constants.CARD_GAME_CLEAR);

        //ゲームオーバー画面デバッグ用
        JButton buttonTitleScreenGameOver = new JButton(Constants.DISPLAY_BUTTON_GAME_OVER);
        buttonTitleScreenGameOver.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 20));
        buttonTitleScreenGameOver.setPreferredSize(new Dimension(300, 50));
        buttonTitleScreenGameOver.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTitleScreenGameOver.addActionListener(this);
        buttonTitleScreenGameOver.setActionCommand(Constants.CARD_GAME_OVER);

        cardTitleScreen.add(Box.createGlue());
        cardTitleScreen.add(labelTitleScreenTitle);
        cardTitleScreen.add(Box.createGlue());
        cardTitleScreen.add(Box.createGlue());
        cardTitleScreen.add(buttonTitleScreenGameStart);
        cardTitleScreen.add(Box.createGlue());
        cardTitleScreen.add(buttonTitleScreenRuleDescription);
        cardTitleScreen.add(Box.createGlue());
        cardTitleScreen.add(buttonTitleScreenGameEnd);
        cardTitleScreen.add(Box.createGlue());
        //ゲームクリア画面デバッグ用
        cardTitleScreen.add(buttonTitleScreenGameClear);
        //ゲームオーバー画面デバッグ用
        cardTitleScreen.add(buttonTitleScreenGameOver);

        Container contentPane01 = getContentPane();
        contentPane01.add(cardTitleScreen, BorderLayout.CENTER);

        //ゲーム画面カード
        JPanel cardGameScreen = new JPanel();
        GridBagLayout gbLayout = new GridBagLayout();
        cardGameScreen.setLayout(gbLayout);

        GridBagConstraints positionPreference = new GridBagConstraints();

        JButton buttonGameScreenOne = new JButton(Constants.DISPLAY_BUTTON_ONE);
        JButton buttonGameScreenTwo = new JButton(Constants.DISPLAY_BUTTON_TWO);
        JButton buttonGameScreenThree = new JButton(Constants.DISPLAY_BUTTON_THREE);
        JButton buttonGameScreenFour = new JButton(Constants.DISPLAY_BUTTON_FOUR);
        JButton buttonGameScreenFive = new JButton(Constants.DISPLAY_BUTTON_FIVE);
        JButton buttonGameScreenSix = new JButton(Constants.DISPLAY_BUTTON_SIX);
        JButton buttonGameScreenSeven = new JButton(Constants.DISPLAY_BUTTON_SEVEN);
        JButton buttonGameScreenEight = new JButton(Constants.DISPLAY_BUTTON_EIGHT);
        JButton buttonGameScreenNine = new JButton(Constants.DISPLAY_BUTTON_NINE);
        JButton buttonGameScreenZero = new JButton(Constants.DISPLAY_BUTTON_ZERO);
        JButton buttonGameScreenReset = new JButton(Constants.DISPLAY_BUTTON_RESET);
        JButton buttonGameScreenConfirm = new JButton(Constants.DISPLAY_BUTTON_CONFIRM);

        buttonGameScreenOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 12));

        positionPreference.gridx = 5;
        positionPreference.gridy = 5;
        gbLayout.setConstraints(buttonGameScreenOne, positionPreference);

        cardGameScreen.add(Box.createGlue());
        cardGameScreen.add(Box.createGlue());
        cardGameScreen.add(buttonGameScreenOne);
        cardGameScreen.add(Box.createGlue());

        Container contentPane02 = getContentPane();
        contentPane02.add(cardGameScreen, BorderLayout.CENTER);

        //ルール説明画面カード
        JPanel cardRuleDescription = new JPanel();
        cardRuleDescription.setLayout(new BoxLayout(cardRuleDescription, BoxLayout.Y_AXIS));

        JLabel labelRuleDescriptionRule = new JLabel(Constants.DISPLAY_TEXT_RULE_DESCRIPTION);
        JButton buttonRuleDescriptionBack = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        labelRuleDescriptionRule.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 18));
        buttonRuleDescriptionBack.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));

        labelRuleDescriptionRule.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRuleDescriptionBack.setAlignmentX(Component.RIGHT_ALIGNMENT);

        buttonRuleDescriptionBack.addActionListener(this);
        buttonRuleDescriptionBack.setActionCommand(Constants.CARD_TITLE_SCREEN);

        cardRuleDescription.add(Box.createGlue());
        cardRuleDescription.add(labelRuleDescriptionRule);
        cardRuleDescription.add(Box.createGlue());
        cardRuleDescription.add(buttonRuleDescriptionBack);
        cardRuleDescription.add(Box.createGlue());

        Container contentPane03 = getContentPane();
        contentPane03.add(cardRuleDescription, BorderLayout.CENTER);

        //ゲームクリア画面カード
        JPanel cardGameClear = new JPanel();
        cardGameClear.setLayout(new BoxLayout(cardGameClear, BoxLayout.Y_AXIS));

        JLabel labelGameClearResult = new JLabel(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT);
        JButton buttonGameClearBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        labelGameClearResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
        buttonGameClearBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));

        labelGameClearResult.setAlignmentX(CENTER_ALIGNMENT);
        labelGameClearResult.setHorizontalAlignment(JLabel.CENTER);
        buttonGameClearBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonGameClearBackToTitle.addActionListener(this);
        buttonGameClearBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);

        cardGameClear.add(Box.createGlue());
        cardGameClear.add(labelGameClearResult);
        cardGameClear.add(Box.createGlue());
        cardGameClear.add(buttonGameClearBackToTitle);
        cardGameClear.add(Box.createGlue());

        Container contentPane04 = getContentPane();
        contentPane04.add(cardGameClear, BorderLayout.CENTER);

        //ゲームオーバー画面カード
        JPanel cardGameOver = new JPanel();
        cardGameOver.setLayout(new BoxLayout(cardGameOver, BoxLayout.Y_AXIS));

        JLabel labelGameOverResult = new JLabel(Constants.DISPLAY_TEXT_GAME_OVER_RESULT);
        JButton buttonGameOverBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        labelGameOverResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
        buttonGameOverBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));

        labelGameOverResult.setAlignmentX(CENTER_ALIGNMENT);
        labelGameOverResult.setHorizontalAlignment(JLabel.CENTER);
        buttonGameOverBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonGameOverBackToTitle.addActionListener(this);
        buttonGameOverBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);

        cardGameOver.add(Box.createGlue());
        cardGameOver.add(labelGameOverResult);
        cardGameOver.add(Box.createGlue());
        cardGameOver.add(buttonGameOverBackToTitle);
        cardGameOver.add(Box.createGlue());

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
        if(cmd.equals(Constants.BUTTON_GAME_END)){
            Component c = (Component)e.getSource();
            Window w = SwingUtilities.getWindowAncestor(c);
            w.dispose();
        }else {
            layout.show(cardPanel, cmd);
        }
    }
}