class Complex {
    int real;
    int imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(int a, int b) {
        real = a;
        imaginary = b;
    }

    public void add(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imaginary = c1.imaginary + c2.imaginary;
    }

    public void multiply(Complex c1, Complex c2) {
        real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        imaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;
    }

    @Override
    public String toString() {
        if (imaginary < 0)

            return real + "-i" + (-1 * imaginary);
        else
            return real + "+i" + imaginary;
    }

}

public class q1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -2);
        Complex c3 = new Complex();
        c3.add(c1, c2);
        System.out.println(c3.toString());
        c3.multiply(c1, c2);
        System.out.println(c3.toString());
    }
}