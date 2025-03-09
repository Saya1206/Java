// calculate the area of triangle

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.printf("Area of triangle: %.3f", area);

    }

}
