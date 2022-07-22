import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Demo extends Frame {
    Label label = new Label("This is my First Frame", Label.CENTER);

    Demo() {

        add(label);
        addWindowListener(new MyWindowAdapter());
        setBackground(Color.pink);
        setSize(400, 400);
        setVisible(true);
        setTitle("My Frame");
    }
}

public class q9Awt {
    public static void main(String[] args) {
        Demo f = new Demo();
    }
}