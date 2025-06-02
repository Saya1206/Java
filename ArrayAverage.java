
import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = sum(arr);    // Call sum method
        System.out.println("Sum of array: " + totalSum);

        double avg = average(arr);    // Call average method
        System.out.println("Average of array: " + avg);
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double average(int[] arr) {
        int total = sum(arr);   // Reuse the sum method
        double avg = total / arr.length;
        return avg;
    }
}
