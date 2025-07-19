public class ArrayIndexExample {
  public static void main(String[] args) {

    int[] arr = { 10, 20, 30 };

    try {
      System.out.println(arr[6]); // Invalid index
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index is out of bounds!");
    }
  }
}
