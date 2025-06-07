
import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements for first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter " + n1 + " elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter no of elements for second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter " + n2 + " elements");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // // Sorting input arrays before merging (if your arrays are not sorted before merging.)
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        
        int[] merge = merge(arr1, arr2);

        for (int val : merge) {
            System.out.print(val + " ");
        }

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Compare and add smaller element
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements (if any)
        while (i < n1) {
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j < n2) {
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;
    }
}
