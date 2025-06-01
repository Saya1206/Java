
public class DemoArray {

    public static void main(String[] args) {

        // Declare an array
        int[] numbers = new int[5];

        // Assign values using index
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Declare and initialize an array
        int[] marks = {23, 45, 67, 89, 90};

        // Print the array (Loop through array)
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
