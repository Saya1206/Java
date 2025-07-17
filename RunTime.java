class Animal {
  void sound() {
    System.out.println("Animal makes sound");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("Cat meows");
  }
}

public class RunTime {
  public static void main(String[] args) {
    Animal a1 = new Dog(); // Upcasting
    Animal a2 = new Cat();

    a1.sound();
    a2.sound();
  }
}
