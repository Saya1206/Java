
public class DeleteFromArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int elementToDelete = 30;

        // Call method to delete element
        int[] newArr = deleteElement(arr, elementToDelete);

        // Print new array
        for (int num : newArr) {
            System.out.print(num + " ");
        }

    }

    public static int[] deleteElement(int[] arr, int target) {
        int index = -1;

        // Find index of the element to delete
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // If element not found, return same array
        if (index == -1) {
            System.out.println("not found");
            return arr;
        }

        // Create new array (size = old size - 1)
        int[] result = new int[arr.length - 1];
        int j = 0;

        // Copy all elements except the one to delete
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }
}
