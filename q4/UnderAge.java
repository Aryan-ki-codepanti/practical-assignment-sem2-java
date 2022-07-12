public class UnderAge extends Exception {
    private int age;

    public UnderAge(int a) {
        age = a;
    }

    public String toString() {
        return ("Under Age [" + age + "]");
    }
}

class exceptionDemo {
    public static void test(int a) throws UnderAge {
        if (a < 18) {
            throw new UnderAge(a);
        }
        System.out.println("Valid Age [" + a + "]");
    }
}
