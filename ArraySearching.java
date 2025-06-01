
import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 45, 89, 65, 33, 100, 55};

        System.out.print("Enter the element to search: ");
        int num = sc.nextInt();

        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in the array");
        } else {
            System.out.println("Your number was not found in the array");
        }

    }

    public static boolean isFound(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
