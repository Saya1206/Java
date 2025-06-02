
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40, 50};

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println(sum);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array: " + sum);
    }
}
