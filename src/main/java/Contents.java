import javax.swing.*;
import java.awt.*;

class Contents extends JFrame {
    public static void main(String[] args) {
        Contents frame = new Contents("ヒット&ブロー");
        frame.setVisible(true);
    }

    Contents(String title) {
        setTitle(title);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JButton button1 = new JButton("ゲームスタート");
        JButton button2 = new JButton("ルール説明");
        JButton button3 = new JButton("ゲーム終了");

        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
    }
}
