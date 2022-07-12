public class Main {
    public static void main(String[] args) {
        try {
            exceptionDemo.test(40);
            exceptionDemo.test(16);
        } catch (UnderAge e) {
            System.out.println("Caught : " + e);
        }
    }
}
