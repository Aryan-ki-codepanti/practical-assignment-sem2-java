import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Demo extends Frame implements ActionListener {
    Button a = new Button("A");
    Button b = new Button("B");
    Label label = new Label("                                           ");

    Demo() {

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setTitle("My Frame");

        b.addActionListener(this);
        a.addActionListener(this);
        addWindowListener(new MyWindowAdapter());
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

public class q12Awt {
    public static void main(String[] args) {
        {
            Demo f = new Demo();
        }
    }
}