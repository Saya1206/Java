
public class SolidRhombus {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop -> spaces to shift the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner loop -> star
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
