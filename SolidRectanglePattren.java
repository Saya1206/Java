
public class SolidRectanglePattren {

    public static void main(String[] args) {

        //Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for columns (stars in each row)
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println(" ");
        }
    }
}
