
public class DemoSwitch {

    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1 ->
                System.out.println("One");
            case 2 ->
                System.out.println("Two");
            case 3 ->
                System.out.println("Three");
            case 4 ->
                System.out.println("Four");
            default ->
                System.out.println("Wrong Choice");
        }
    }
}
