
package P1;

/**
 * TwoDim
 */

public class TwoDim {

    private int x, y;

    public TwoDim() {
        x = 0;
        y = 0;
    }

    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int coordinates() {
        return 2;
    }

    @Override
    public String toString() {
        String s = "";
        s += x;
        s += " , ";
        s += y;
        return s;
    }

}