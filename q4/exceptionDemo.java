
class UnderAge extends Exception {

    int age;

    public UnderAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "Underage - " + age;
        return s;
    }
}

public class exceptionDemo {

    static void test(int a) throws UnderAge {
        if (a < 18)
            throw new UnderAge(a);
        System.out.println("Age : " + a);
    }

    public static void main(String[] args) {
        try {
            test(18);
            test(16);
            test(38);
        } catch (UnderAge e) {
            System.out.println("Exception occured : " + e);
        }
    }
}
