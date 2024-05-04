import javax.swing.*;
import java.awt.*;

public class Swingexample{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JButton b1 = new JButton("Click Me");
        JLabel l1 = new JLabel("Aronyo");
        JTextField t1 = new JTextField(10);


        frame.add(panel);
        panel.add(b1);
        panel.add(l1);
        panel.add(t1);

        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }
    
}
