// Calculate Simple Interest

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in % per year):");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double result = (principal * rate * time) / 100;

        System.out.printf("Simple Interest:: %.2f", result);
    }
}
