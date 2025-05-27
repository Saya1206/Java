
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int i = 1;
        while (true) {
            int factor = first * i;       // Generate multiples of first number
            if (factor % second == 0) {   // Check if it's also divisible by second
                System.out.println("LCM is: " + factor);
                break;    // LCM found, exit loop
            }
            i++;         // Try next multiple
        }

    }
}
