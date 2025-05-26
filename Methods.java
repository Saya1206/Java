
public class Methods {

    // method without return value (void)
    public static void greet() {
        System.out.println("Hello!");
    }

    // method with return value
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        greet();
        System.out.println(add(10, 4));
    }
}
