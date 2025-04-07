
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in % per year):");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double result = principal * Math.pow((1 + rate / 100), time);
        System.out.printf("Compound Interest: %.2f", result);

    }
}
