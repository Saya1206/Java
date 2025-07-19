public class DivideByZeroExample {
  public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int result = a / b; // Exception
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
    }
  }
}
