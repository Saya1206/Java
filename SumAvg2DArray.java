
import java.util.Scanner;

public class SumAvg2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int sum = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Element at row: " + (i + 1) + " ,column: " + (j + 1));
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
