import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Demo extends Frame implements ActionListener {
    Button bb = new Button("Blue");
    Button rb = new Button("Red");

    Demo() {

        setLayout(new FlowLayout());

        setSize(400, 400);
        setVisible(true);
        setTitle("My Frame");

        rb.addActionListener(this);
        bb.addActionListener(this);
        addWindowListener(new MyWindowAdapter());
        add(rb);
        add(bb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bb)
            setBackground(Color.blue);
        if (e.getSource() == rb)
            setBackground(Color.red);
    }
}

public class q10Awt {
    public static void main(String[] args) {
        {
            Demo f = new Demo();
        }
    }
}