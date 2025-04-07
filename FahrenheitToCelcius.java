
import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temp in F: ");
        float fah = sc.nextFloat();

        float cel = (fah - 32) * 5 / 9;
        System.out.println("Temerature is: " + cel + "C");
    }
}
