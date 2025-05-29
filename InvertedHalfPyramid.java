
public class InvertedHalfPyramid {

    public static void main(String[] args) {
        int rows = 4;

        // outer loop
        for (int i = rows; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
