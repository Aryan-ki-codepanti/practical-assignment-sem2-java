package P2;
import java.util.Scanner;

import P1.*;

public class Circle extends Shape {

    public float r;

    public Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r = sc.nextFloat();
        sc.close();
    }

    public float area(){
        return 3.142f * r * r;
    }
    public void display(){
        System.out.println("Radius of circle : "  + r);
    }
}
