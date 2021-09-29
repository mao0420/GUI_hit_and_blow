import javax.swing.*;
import java.awt.*;

public class Contents extends JFrame {
    public static void main(String[] args) {
        Contents frame = new Contents();
        frame.setTitle("ヒット&ブロー");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Contents() {
        //panel_a
        JPanel panel_a = new JPanel();
        panel_a.setLayout(new BoxLayout(panel_a, BoxLayout.Y_AXIS));

        JLabel label_a1 = new JLabel("Hit & Blow");
        JButton button_a1 = new JButton("ゲームスタート");
        JButton button_a2 = new JButton("ルール説明");
        JButton button_a3 = new JButton("ゲーム終了");

        label_a1.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 100));
        button_a1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));
        button_a2.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));
        button_a3.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));

        button_a1.setPreferredSize(new Dimension(300, 50));
        button_a2.setPreferredSize(new Dimension(400, 50));
        button_a3.setPreferredSize(new Dimension(400, 50));

        label_a1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button_a1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button_a2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button_a3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel_a.add(Box.createGlue());
        panel_a.add(label_a1);
        panel_a.add(Box.createGlue());
        panel_a.add(Box.createGlue());
        panel_a.add(button_a1);
        panel_a.add(Box.createGlue());
        panel_a.add(button_a2);
        panel_a.add(Box.createGlue());
        panel_a.add(button_a3);
        panel_a.add(Box.createGlue());

        Container contentPane01 = getContentPane();
        contentPane01.add(panel_a, BorderLayout.CENTER);

//        //panel_b
//        JPanel panel_b = new JPanel();
//        panel_b.setLayout(new BoxLayout(panel_b, BoxLayout.Y_AXIS));
//
//        JLabel label_b1 = new JLabel("""
//                <html><body>ヒット&ブローはプログラム側がランダムで設定した数字を当てるゲームです。<br/>
//                <br/>
//                このプログラムでは被り無しの0～9の数字が3桁設定されます。<br/>
//                ユーザー側が3桁の数字を入力し、<br/>
//                その数字と正解の数字を比較して次のヒントが表示されます。<br/>
//                <br/>
//                ヒット:桁の位置も数字も合っている数字の数です。<br/>
//                ブロー:数字は合っているが、桁の位置が違う数字の数です。<br/>
//                <br/>
//                例:正解が[083]入力が[385]の時、<br/>
//                　 8は桁の位置も数字も合っている為ヒット、<br/>
//                　 3は桁の位置が違うが数字は合っている為ブローとなり、<br/>
//                　 ヒットとブローの数がそれぞれ1つずつの為、ヒット:1 ブロー:1と表示されます。<br/>
//                <br/>
//                その後、再度数字の入力から繰り返し、3桁全部の数字を当てた場合はゲームクリアです。<br/>
//                少ない回数でのクリアを目指してください。<br/>
//                <br/>
//                10回目の入力までに正解の数字を見つけられないとゲームオーバーになります。<br/>
//                また、数値入力時にGを入力するとギブアップとしてゲームを終了する事が出来ます。<br/>
//                <br/></body></html>
//                """);
//        JButton button_b1 = new JButton("戻る");
//
//        label_b1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
//        button_b1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 30));
//
//        label_b1.setAlignmentX(Component.CENTER_ALIGNMENT);
//        button_b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
//
//        panel_b.add(Box.createGlue());
//        panel_b.add(label_b1);
//        panel_b.add(Box.createGlue());
//        panel_b.add(button_b1);
//        panel_b.add(Box.createGlue());
//
//        Container contentPane02 = getContentPane();
//        contentPane02.add(panel_b, BorderLayout.CENTER);
    }
}
