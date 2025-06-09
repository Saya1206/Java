
import java.util.Scanner;

public class Search2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        search(arr, num);

    }

    public static void search(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Element found at position: " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Element is not found in the array");
    }
}
