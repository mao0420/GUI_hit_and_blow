import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RuleDescriptionPanel extends Container {

    private final JLabel labelRule;
    private final JButton buttonBack;

    public RuleDescriptionPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelRule = new JLabel(Constants.DISPLAY_TEXT_RULE_DESCRIPTION);
        buttonBack = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        setFontInRuleDescriptionPanel();
        setAlignmentInRuleDescriptionPanel();
        setActionInRuleDescriptionPanel(actionListener);

        this.add(Box.createGlue());
        this.add(labelRule);
        this.add(Box.createGlue());
        this.add(buttonBack);
        this.add(Box.createGlue());
    }

    private void setFontInRuleDescriptionPanel() {
        labelRule.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 18));
        buttonBack.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, 30));
    }

    private void setAlignmentInRuleDescriptionPanel() {
        labelRule.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonBack.setAlignmentX(Component.RIGHT_ALIGNMENT);
    }

    private void setActionInRuleDescriptionPanel(ActionListener actionListener) {
        buttonBack.addActionListener(actionListener);
        buttonBack.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
