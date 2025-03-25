package simpleCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Area abc = new Area();

        System.out.println("1 for Circle: ");
        System.out.println("2 for Square: ");
        System.out.println("3 for Triangle: ");
        System.out.println("4 for Rectangle: ");

        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                abc.areaCircle(r);
                break;

            case 2:
                System.out.println("Enter the side of the square: ");
                double side = sc.nextDouble();
                abc.areaSquare(side);
                break;

            case 3:
                System.out.println("Enter the three sides of the triangle: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                abc.areaTriangle(a, b, c);
                break;

            case 4:
                System.out.println("Enter the width and height of the rectangle: ");
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                abc.areaRectangle(width, height);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("The area is: " + abc.getArea());
    }
}
