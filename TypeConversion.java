
public class TypeConversion {

    public static void main(String[] args) {

        // Implicit
        // byte -> short -> int -> long -> float -> double
        float num = 23;
        System.out.println(num);

        long num2 = 10;
        System.out.println(num2);

        double num3 = 244;
        System.out.println(num3);

        // Explicit 
        // byte <- short <- int <- long <- float <- double
        float percent = (float) 82.34;
        System.out.println(percent);

        int marks = (int) 90.23f;
        System.out.println(marks);

        long myNum = (long) 6.7;
        System.out.println(myNum);
    }
}
