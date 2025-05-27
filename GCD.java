
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        // Find the smaller of the two numbers
        int min = first < second ? first : second;

        // Initial value of GCD
        int gcd = 1;

        // Loop from 1 to the smaller number
        for (int i = 1; i <= min; i++) {
            // If 'i' divides both 'a' and 'b' completely (no remainder)
            if (first % i == 0 && second % i == 0) {
                gcd = i;    // Update GCD
            }
        }
        System.out.println("GCD is: " + gcd);
    }
}
