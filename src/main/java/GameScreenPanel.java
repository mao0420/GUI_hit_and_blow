import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameScreenPanel extends JPanel {

    private final JLabel labelOneDigits;
    private final JLabel labelTwoDigits;
    private final JLabel labelThreeDigits;
    private final JLabel labelInputHistoryMessageLeft;
    private final JLabel labelInputHistoryMessageRight;
    private final JLabel labelInputHistoryDescriptionLeft;
    private final JLabel labelInputHistoryDescriptionRight;
    private final JLabel labelInputHistoryNumberOne;
    private final JLabel labelInputHistoryNumberTwo;
    private final JLabel labelInputHistoryNumberThree;
    private final JLabel labelInputHistoryNumberFour;
    private final JLabel labelInputHistoryNumberFive;
    private final JLabel labelInputHistoryNumberSix;
    private final JLabel labelInputHistoryNumberSeven;
    private final JLabel labelInputHistoryNumberEight;
    private final JLabel labelInputHistoryNumberNine;
    private final JLabel labelInputHistoryNumberTen;
    private final JButton buttonOne;
    private final JButton buttonTwo;
    private final JButton buttonThree;
    private final JButton buttonFour;
    private final JButton buttonFive;
    private final JButton buttonSix;
    private final JButton buttonSeven;
    private final JButton buttonEight;
    private final JButton buttonNine;
    private final JButton buttonZero;
    private final JButton buttonReset;
    private final JButton buttonConfirm;
    private final JButton buttonGiveUp;
    private final JLabel labelInputTimes;
    private final JLabel labelInputSpaceLeft;
    private final JLabel labelInputSpaceRight;
    private final JLabel labelInputSpaceCenter;

    public GameScreenPanel(ActionListener actionListener) {
        GridBagLayout gbLayout = new GridBagLayout();
        this.setLayout(gbLayout);

        GridBagConstraints positionPreference = new GridBagConstraints();

        labelOneDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelTwoDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelThreeDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelInputHistoryMessageLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        labelInputHistoryMessageRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        labelInputHistoryDescriptionLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        labelInputHistoryDescriptionRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        labelInputHistoryNumberOne = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberTwo = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberThree = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberFour = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberFive = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberSix = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberSeven = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberEight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberNine = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberTen = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        buttonOne = new JButton(Constants.DISPLAY_BUTTON_ONE);
        buttonTwo = new JButton(Constants.DISPLAY_BUTTON_TWO);
        buttonThree = new JButton(Constants.DISPLAY_BUTTON_THREE);
        buttonFour = new JButton(Constants.DISPLAY_BUTTON_FOUR);
        buttonFive = new JButton(Constants.DISPLAY_BUTTON_FIVE);
        buttonSix = new JButton(Constants.DISPLAY_BUTTON_SIX);
        buttonSeven = new JButton(Constants.DISPLAY_BUTTON_SEVEN);
        buttonEight = new JButton(Constants.DISPLAY_BUTTON_EIGHT);
        buttonNine = new JButton(Constants.DISPLAY_BUTTON_NINE);
        buttonZero = new JButton(Constants.DISPLAY_BUTTON_ZERO);
        buttonReset = new JButton(Constants.DISPLAY_BUTTON_RESET);
        buttonConfirm = new JButton(Constants.DISPLAY_BUTTON_CONFIRM);
        buttonGiveUp = new JButton(Constants.DISPLAY_BUTTON_GIVE_UP);
        labelInputTimes = new JLabel(Constants.DISPLAY_TEXT_INPUT_TIMES);
        labelInputSpaceLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);
        labelInputSpaceRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);
        labelInputSpaceCenter = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);

        setFontInGameScreenPanel();
        buttonSettingsInGameScreenPanel();
        setPositionInGameScreenPanel(positionPreference, gbLayout);
        setActionInSettingsInGameScreenPanel(actionListener);

        this.add(labelOneDigits);
        this.add(labelTwoDigits);
        this.add(labelThreeDigits);
        this.add(labelInputHistoryMessageLeft);
        this.add(labelInputHistoryMessageRight);
        this.add(labelInputHistoryDescriptionLeft);
        this.add(labelInputHistoryDescriptionRight);
        this.add(labelInputHistoryNumberOne);
        this.add(labelInputHistoryNumberTwo);
        this.add(labelInputHistoryNumberThree);
        this.add(labelInputHistoryNumberFour);
        this.add(labelInputHistoryNumberFive);
        this.add(labelInputHistoryNumberSix);
        this.add(labelInputHistoryNumberSeven);
        this.add(labelInputHistoryNumberEight);
        this.add(labelInputHistoryNumberNine);
        this.add(labelInputHistoryNumberTen);
        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);
        this.add(buttonFour);
        this.add(buttonFive);
        this.add(buttonSix);
        this.add(buttonSeven);
        this.add(buttonEight);
        this.add(buttonNine);
        this.add(buttonZero);
        this.add(buttonReset);
        this.add(buttonConfirm);
        this.add(buttonGiveUp);
        this.add(labelInputTimes);
        this.add(labelInputSpaceLeft);
        this.add(labelInputSpaceRight);
        this.add(labelInputSpaceCenter);
    }

    private void setFontInGameScreenPanel() {
        labelOneDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelTwoDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelThreeDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelInputHistoryMessageLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelInputHistoryMessageRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelInputHistoryDescriptionLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelInputHistoryDescriptionRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelInputHistoryNumberOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberTen.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        buttonOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonZero.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_NUMBER));
        buttonReset.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_RESET));
        buttonConfirm.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_CONFIRM));
        buttonGiveUp.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_GIVE_UP));
        labelInputTimes.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_TIMES));
    }

    private void buttonSettingsInGameScreenPanel() {
        buttonOne.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonTwo.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonThree.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonFour.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonFive.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonSix.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonSeven.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonEight.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonNine.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonZero.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonReset.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonConfirm.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGiveUp.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
    }

    private void setPositionInGameScreenPanel(GridBagConstraints positionPreference, GridBagLayout gbLayout) {
        positionPreference.gridx = 3;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelOneDigits, positionPreference);

        positionPreference.gridx = 4;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelTwoDigits, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 2;
        gbLayout.setConstraints(labelThreeDigits, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelInputHistoryMessageLeft, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelInputHistoryMessageRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 2;
        positionPreference.insets = new Insets(3, 10, 3, 3);
        gbLayout.setConstraints(labelInputHistoryDescriptionLeft, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 2;
        positionPreference.insets = new Insets(3, 3, 3, 10);
        gbLayout.setConstraints(labelInputHistoryDescriptionRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 3;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberOne, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 4;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberTwo, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 5;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberThree, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 6;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberFour, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 7;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberFive, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 3;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberSix, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 4;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberSeven, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 5;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberEight, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 6;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberNine, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 7;
        positionPreference.insets = new Insets(3, 3, 3, 3);
        gbLayout.setConstraints(labelInputHistoryNumberTen, positionPreference);

        positionPreference.gridx = 3;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonOne, positionPreference);

        positionPreference.gridx = 4;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonTwo, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 9;
        gbLayout.setConstraints(buttonThree, positionPreference);

        positionPreference.gridx = 3;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonFour, positionPreference);

        positionPreference.gridx = 4;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonFive, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(buttonSix, positionPreference);

        positionPreference.gridx = 3;
        positionPreference.gridy = 11;
        gbLayout.setConstraints(buttonSeven, positionPreference);

        positionPreference.gridx = 4;
        positionPreference.gridy = 11;
        gbLayout.setConstraints(buttonEight, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 11;
        gbLayout.setConstraints(buttonNine, positionPreference);

        positionPreference.gridx = 3;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(buttonReset, positionPreference);

        positionPreference.gridx = 4;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(buttonZero, positionPreference);

        positionPreference.gridx = 5;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(buttonConfirm, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(buttonGiveUp, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(labelInputTimes, positionPreference);

        positionPreference.gridx = 2;
        positionPreference.gridy = 1;
        positionPreference.weightx = 0.1d;
        gbLayout.setConstraints(labelInputSpaceLeft, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 1;
        positionPreference.weightx = 0.1d;
        gbLayout.setConstraints(labelInputSpaceRight, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 8;
        positionPreference.insets = new Insets(30, 0, 30, 0);
        gbLayout.setConstraints(labelInputSpaceCenter, positionPreference);
    }

    private void setActionInSettingsInGameScreenPanel(ActionListener actionListener) {
        buttonGiveUp.addActionListener(actionListener);
        buttonGiveUp.setActionCommand(Constants.CARD_GAME_OVER);
    }
}