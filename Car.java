// Class definition
public class Car {

  // Fields (properties)
  String color = "white";
  int speed = 100;

  // Method (behavior)
  void drive() {
    System.out.println("The car is driving at speed " + speed + "km");
  }

  public static void main(String[] args) {
    // Creating an object of Car
    Car myCar = new Car();

    System.out.println("Color: " + myCar.color);
    myCar.drive();
  }

}
