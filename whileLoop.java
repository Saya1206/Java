
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        // Prints numbers from 0 to 5 using a while loop
        int i = 0;    // initialization
        while (i <= 5) {    // condition
            System.out.println(i);  // Print current value of i
            i++;          // updatation (Increment i by 1)
        }

        // Prints numbers from 10 to 1 in reverse order
        int num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        // Takes 5 integer inputs from the user and prints them
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 5) {
            int count = sc.nextInt();
            System.out.println("Number is: " + count);
            n++;
        }
    }
}
