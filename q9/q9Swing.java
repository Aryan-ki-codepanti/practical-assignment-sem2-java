import javax.swing.*;
import java.awt.*;

class Demo extends JFrame {
    Demo() {
        setLayout(new FlowLayout());
        JLabel lbl = new JLabel("This is my First Frame", JLabel.CENTER);
        add(lbl);
    }
}

public class q9Swing {

    public static void main(String[] args) {
        Demo f = new Demo();
        f.setVisible(true);
        f.getContentPane().setBackground(Color.pink);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}