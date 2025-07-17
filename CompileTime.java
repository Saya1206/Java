class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }
}

public class CompileTime {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.add(10, 20));
    System.out.println(obj.add(10, 20, 40));
    System.out.println(obj.add(23.40, 67.90));
  }
}
