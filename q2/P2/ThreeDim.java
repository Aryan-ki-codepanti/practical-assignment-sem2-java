package P2;

import P1.*;

public class ThreeDim extends TwoDim {

    private int z;

    public ThreeDim() {
        z = 0;
    }

    public ThreeDim(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int coordinates() {
        return 3;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += " , ";
        s += z;
        return s;
    }

}
