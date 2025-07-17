class Animal {
  void sound() {
    System.out.println("Animal makes sound");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks");
  }

  void display() {
    sound(); // calls Dog's sound
    super.sound(); // calls Animal's sound
  }
}

public class SuperKeyword_ {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.display();
  }
}
