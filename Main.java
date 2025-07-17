class Animal {
  void eat() {
    System.out.println("Animal eats food");
  }
};

class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.bark();
    obj.eat();
  }
}
