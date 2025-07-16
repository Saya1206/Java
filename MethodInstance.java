public class MethodInstance {

  void greet() {
    System.out.println("Good Morning!!");
  }

  public static void main(String[] args) {
    MethodInstance obj = new MethodInstance();
    obj.greet(); // calling the method
  }
}
