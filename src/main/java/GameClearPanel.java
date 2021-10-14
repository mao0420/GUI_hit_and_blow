import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameClearPanel extends Container {

    static JLabel labelResult;
    private final JButton buttonBackToTitle;

    public GameClearPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelResult = new JLabel(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonBackToTitle.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        setFontInGameClearPanel();
        setAlignmentInGameClearPanel();
        setActionInGameClearPanel(actionListener);

        this.add(Box.createGlue());
        this.add(labelResult);
        this.add(Box.createGlue());
        this.add(buttonBackToTitle);
        this.add(Box.createGlue());
    }

    private void setFontInGameClearPanel() {
        labelResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
    }

    private void setAlignmentInGameClearPanel() {
        labelResult.setAlignmentX(CENTER_ALIGNMENT);
        labelResult.setHorizontalAlignment(JLabel.CENTER);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private void setActionInGameClearPanel(ActionListener actionListener) {
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
