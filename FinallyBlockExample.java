public class FinallyBlockExample {
  public static void main(String[] args) {
    try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("Error occurred");
    } finally {
      System.out.println("Finally block always runs");
    }
  }
}
