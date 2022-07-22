
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    public MouseEventDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // Handle mouse entered
    public void mouseEntered(MouseEvent me) {
        setSize(new Dimension(900, 900));
    }
    
    // Handle mouse clicked
    public void mouseClicked(MouseEvent me) {
        setSize(new Dimension(300, 300));
    }

    // Handle mouse exited
    public void mouseExited(MouseEvent me) {
        System.exit(0);
    }

    // Handle mouse Dragged
    public void mouseDragged(MouseEvent me) {
    }

    // Handle mouse moved
    public void mouseMoved(MouseEvent me) {
    }

    // Handle mouse Pressed
    public void mousePressed(MouseEvent me) {
    }

    // Handle mouse Released
    public void mouseReleased(MouseEvent me) {
    }

}

public class q8 {
    public static void main(String[] args) {
        MouseEventDemo appwin = new MouseEventDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("Q8 java frame");
        appwin.setVisible(true);
    }
}
