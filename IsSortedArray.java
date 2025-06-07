
import java.util.Scanner;

public class IsSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // boolean isInc = isIncreasing(arr);
        // boolean isDec = isDecreasing(arr);
        // if (isInc || isDec) {
        //     System.out.println("Your array is sorted");
        // } else {
        //     System.out.println("Your array is not sorted");
        // }

        if (isIncreasing(arr)) {
            System.out.println("Array is sorted in increasing order");
        } else if (isDecreasing(arr)) {
            System.out.println("Array is sorted in decreasing order");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
