
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class KeyEventDemo extends Frame implements KeyListener {
    Label label = new Label("Typed Character is : ", Label.CENTER);

    KeyEventDemo() {

        setLayout(new FlowLayout());
        addWindowListener(new MyWindowAdapter());
        addKeyListener(this);
        add(label);
        setSize(400, 400);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        label.setText("");
        label.setText("Typed character is : " + ch);

    }

}

public class q11Awt {
    public static void main(String[] args) {
        KeyEventDemo k = new KeyEventDemo();
    }
}