import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo extends JFrame implements ActionListener {
    JButton a = new JButton("A");
    JButton b = new JButton("B");
    JLabel label = new JLabel("                                                       ");

    Demo() {

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setTitle("My Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b.addActionListener(this);
        a.addActionListener(this);
        add(b);
        add(a);
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a)
            label.setText("George, BMS, 6969 , CBS");
        if (e.getSource() == b)
            label.setText("Previous GPA : 8");
    }
}

public class q12Swing {
    public static void main(String[] args) {
        {
            Demo f = new Demo();
        }
    }
}