// Multiplication of two decimal numbers

import java.util.Scanner;

public class FloatMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first decimal number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double num2 = sc.nextDouble();

        double mul = num1 * num2;

        System.out.println("Result: " + mul);

    }
}
