
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyEventDemo extends JFrame implements KeyListener {
    JLabel label = new JLabel("Typed Character is : ");

    KeyEventDemo() {
        setLayout(new FlowLayout());
        addKeyListener(this);
        add(label);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

public class q11Swing {
    public static void main(String[] args) {
        KeyEventDemo k = new KeyEventDemo();
    }
}