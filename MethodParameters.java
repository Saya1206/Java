public class MethodParameters {

  static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int result = sum(10, 20);
    System.out.println("Sum is: " + result);
  }
}
