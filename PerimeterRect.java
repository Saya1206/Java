// calculate the perimeter of a rectangle

import java.util.Scanner;

public class PerimeterRect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width : ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.printf("Perimeter of rectangle: %.2f", perimeter);
    }
}
