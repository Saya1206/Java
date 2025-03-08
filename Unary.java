public class Unary {

    public static void main(String[] args) {

        // converts a positive value to negative or vice versa
        int x = 9;
        int y = -x;
        System.out.println(y);

        int z = -y;
        System.out.println(z);

        // pre increment (first increment value by 1 then use)
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        // pre decrement (first decrement value by 1 then use)
        System.out.println(--a);
        System.out.println(a);

        // post increment (first use then increment by 1)
        int b = 8;
        System.out.println(b++);
        System.out.println(b);

        // post decrement (first use then decrement by 1)
        System.out.println(b--);
        System.out.println(b);
    }
}
