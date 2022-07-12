
public class exceptionTest {

    static void func() {
    }

    public static void main(String[] args) {
        func();

        try {
            int d = 0;
            int res = 3 / 0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Div by zero " + e);
        }
    }
}
