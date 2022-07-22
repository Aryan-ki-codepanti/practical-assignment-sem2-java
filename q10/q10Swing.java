import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Demo extends JFrame implements ActionListener {
    JButton bb = new JButton("Red");
    JButton rb = new JButton("Blue");

    Demo() {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        rb.setBounds(50, 100, 80, 30);
        bb.setBounds(150, 100, 80, 30);
        rb.addActionListener(this);

        bb.addActionListener(this);
        add(rb);
        add(bb);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bb)
            getContentPane().setBackground(Color.red);
        if (e.getSource() == rb)
            getContentPane().setBackground(Color.blue);

    }
}

public class q10Swing {
    public static void main(String[] args) {
        Demo m1 = new Demo();
        m1.setDefaultCloseOperation(m1.EXIT_ON_CLOSE);
    }
}