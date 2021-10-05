import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameOverPanel extends Container {

    private final JLabel labelResult;
    private final JButton buttonBackToTitle;

    public GameOverPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelResult = new JLabel(Constants.DISPLAY_TEXT_GAME_OVER_RESULT);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        setFontInGameOverPanel();
        setAlignmentInGameOverPanel();
        setActionInGameOverPanel(actionListener);

        this.add(Box.createGlue());
        this.add(labelResult);
        this.add(Box.createGlue());
        this.add(buttonBackToTitle);
        this.add(Box.createGlue());
    }

    private void setFontInGameOverPanel() {
        labelResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
    }

    private void setAlignmentInGameOverPanel() {
        labelResult.setAlignmentX(CENTER_ALIGNMENT);
        labelResult.setHorizontalAlignment(JLabel.CENTER);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private void setActionInGameOverPanel(ActionListener actionListener) {
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
