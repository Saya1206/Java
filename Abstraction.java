abstract class car {
  abstract void drive();

  void start() {
    System.out.println("Start...");
  }
}

class wagnor extends car {
  @Override
  void drive() {
    System.out.println("Drive a wagnor car");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    wagnor obj = new wagnor();
    obj.drive();
    obj.start();
  }
}
