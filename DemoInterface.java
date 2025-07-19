interface Vehicle {
  void start(); // abstract by default
}

class Car implements Vehicle {
  public void start() {
    System.out.println("Car starts");
  }
}

public class DemoInterface {
  public static void main(String[] args) {
    Car obj = new Car();
    obj.start();
  }
}
