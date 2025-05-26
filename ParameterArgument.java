/*
Parameter :	The variable defined in the method declaration.
Argument :The actual value passed to the method when calling it.
 */

public class ParameterArgument {

    // Parameters : a & b
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Arguments: 5 and 8
        int result = add(5, 8);
        System.out.println(result);
    }
}
