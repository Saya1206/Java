// BODMAS (Bracket, Order, Divide, Multiply, Add, Subtract)

public class OrderOfOperation {

    public static void main(String[] args) {

        System.out.println(3 + 10 * 2);

        // evaluated from left to right (same precedence)
        System.out.println(12 / 4 / 3);

        System.out.println(10 * 2 / 2);

        System.out.println(2 * (9 / 3));  // brackets are evaluated first, followed by multiplication
    }
}
