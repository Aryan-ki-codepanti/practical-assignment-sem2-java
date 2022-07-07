
public class errorDemo {

    public static void func(int arr[]){
        
        try {
            System.out.println(arr[0]);
            System.out.println(arr[4]);
            System.out.println(arr[5]);
            System.out.println("gola");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry error occured due to index out of bounds");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 7 };
        func(arr);

    }

}
