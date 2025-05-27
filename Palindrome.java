
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int newNum = num;

        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        if (newNum == reverse) {
            System.out.println(newNum + " is palindrome number");
        } else {
            System.out.println(newNum + " is not palindrome number");
        }
    }
}
