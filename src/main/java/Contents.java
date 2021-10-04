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

        JLabel labelGameScreenOneDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        JLabel labelGameScreenTwoDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        JLabel labelGameScreenThreeDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        JLabel labelGameScreenInputHistoryMessageLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        JLabel labelGameScreenInputHistoryMessageRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        JLabel labelGameScreenInputHistoryDescriptionLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        JLabel labelGameScreenInputHistoryDescriptionRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        JLabel labelGameScreenInputHistoryNumberOne = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberTwo = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberThree = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberFour = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberFive = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberSix = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberSeven = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberEight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberNine = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        JLabel labelGameScreenInputHistoryNumberTen = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
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
        JButton buttonGameScreenGiveUp = new JButton(Constants.DISPLAY_BUTTON_GIVE_UP);
        JLabel labelGameScreenInputTimes = new JLabel(Constants.DISPLAY_TEXT_INPUT_TIMES);

        labelGameScreenOneDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelGameScreenTwoDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelGameScreenThreeDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelGameScreenInputHistoryMessageLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelGameScreenInputHistoryMessageRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelGameScreenInputHistoryDescriptionLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelGameScreenInputHistoryDescriptionRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelGameScreenInputHistoryNumberOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelGameScreenInputHistoryNumberTen.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        buttonGameScreenOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenZero.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonGameScreenReset.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_RESET));
        buttonGameScreenConfirm.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_CONFIRM));
        buttonGameScreenGiveUp.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_GIVE_UP));
        labelGameScreenInputTimes.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_TIMES));

        buttonGameScreenOne.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenTwo.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenThree.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenFour.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenFive.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenSix.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenSeven.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenEight.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenNine.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenZero.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenReset.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenConfirm.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGameScreenGiveUp.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));

        positionPreference.gridx = 5;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelGameScreenOneDigits, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelGameScreenTwoDigits, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelGameScreenThreeDigits, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelGameScreenInputHistoryMessageLeft, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelGameScreenInputHistoryMessageRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelGameScreenInputHistoryDescriptionLeft, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelGameScreenInputHistoryDescriptionRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 3;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberOne, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 4;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberTwo, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 5;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberThree, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 6;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberFour, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 7;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberFive, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 3;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberSix, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 4;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberSeven, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 5;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberEight, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 6;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberNine, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 7;
        gbLayout.setConstraints(labelGameScreenInputHistoryNumberTen, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 7;
        gbLayout.setConstraints(buttonGameScreenOne, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 7;
        gbLayout.setConstraints(buttonGameScreenTwo, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 7;
        gbLayout.setConstraints(buttonGameScreenThree, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 8;
        gbLayout.setConstraints(buttonGameScreenFour, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 8;
        gbLayout.setConstraints(buttonGameScreenFive, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 8;
        gbLayout.setConstraints(buttonGameScreenSix, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonGameScreenSeven, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonGameScreenEight, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonGameScreenNine, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonGameScreenReset, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonGameScreenZero, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonGameScreenConfirm, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonGameScreenGiveUp, positionPreference);

        positionPreference.gridx = 11;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(labelGameScreenInputTimes, positionPreference);

        cardGameScreen.add(labelGameScreenOneDigits);
        cardGameScreen.add(labelGameScreenTwoDigits);
        cardGameScreen.add(labelGameScreenThreeDigits);
        cardGameScreen.add(labelGameScreenInputHistoryMessageLeft);
        cardGameScreen.add(labelGameScreenInputHistoryMessageRight);
        cardGameScreen.add(labelGameScreenInputHistoryDescriptionLeft);
        cardGameScreen.add(labelGameScreenInputHistoryDescriptionRight);
        cardGameScreen.add(labelGameScreenInputHistoryNumberOne);
        cardGameScreen.add(labelGameScreenInputHistoryNumberTwo);
        cardGameScreen.add(labelGameScreenInputHistoryNumberThree);
        cardGameScreen.add(labelGameScreenInputHistoryNumberFour);
        cardGameScreen.add(labelGameScreenInputHistoryNumberFive);
        cardGameScreen.add(labelGameScreenInputHistoryNumberSix);
        cardGameScreen.add(labelGameScreenInputHistoryNumberSeven);
        cardGameScreen.add(labelGameScreenInputHistoryNumberEight);
        cardGameScreen.add(labelGameScreenInputHistoryNumberNine);
        cardGameScreen.add(labelGameScreenInputHistoryNumberTen);
        cardGameScreen.add(buttonGameScreenOne);
        cardGameScreen.add(buttonGameScreenTwo);
        cardGameScreen.add(buttonGameScreenThree);
        cardGameScreen.add(buttonGameScreenFour);
        cardGameScreen.add(buttonGameScreenFive);
        cardGameScreen.add(buttonGameScreenSix);
        cardGameScreen.add(buttonGameScreenSeven);
        cardGameScreen.add(buttonGameScreenEight);
        cardGameScreen.add(buttonGameScreenNine);
        cardGameScreen.add(buttonGameScreenZero);
        cardGameScreen.add(buttonGameScreenReset);
        cardGameScreen.add(buttonGameScreenConfirm);
        cardGameScreen.add(buttonGameScreenGiveUp);
        cardGameScreen.add(labelGameScreenInputTimes);

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