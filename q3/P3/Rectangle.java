package P3;

import java.util.Scanner;

import P1.*;

public class Rectangle extends Shape {

    public float l, b;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        l = sc.nextFloat();
        b = sc.nextFloat();
        sc.close();
    }

    public float area() {
        return l * b;
    }

    public void display() {
        System.out.println("Length of rectangle : " + l);
        System.out.println("Breadth of rectangle : " + b);
    }

}
