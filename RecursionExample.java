public class RecursionExample {

  static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1; // base case
    }

    return n * factorial(n - 1); // recursive call
  }

  public static void main(String[] args) {
    int result = factorial(5);
    System.out.println("Factorial of 5 is: " + result);
  }
}
