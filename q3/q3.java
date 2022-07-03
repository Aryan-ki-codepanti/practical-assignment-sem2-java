import java.util.Scanner;

import P1.*;
import P2.*;
import P3.*;

public class q3 {
    public static void main(String[] args) {
        Shape shape;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape");
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        c = sc.nextInt();

        switch (c) {
            case 1:
                shape = new Rectangle();
                shape.display();
                System.out.println("Area : " + shape.area());
                break;
            case 2:
                shape = new Circle();
                shape.display();
                System.out.println("Area : " + shape.area());
                break;
            default:
                System.out.println("Invalid input");
                System.out.println("Exiting");
        }
        sc.close();
    }
}
