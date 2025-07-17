class Animal {
  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barking...");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("Meowing...");
  }
}

public class Demo {
  public static void main(String[] args) {
    Cat obj1 = new Cat();
    Dog obj2 = new Dog();

    obj1.eat();
    obj1.meow();

    obj2.eat();
    obj2.bark();
  }
}
