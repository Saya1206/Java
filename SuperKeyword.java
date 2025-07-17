class Animal {
  Animal() {
    System.out.println("Animal constructor");
  }
}

class Dog extends Animal {
  Dog() {
    super(); // calls Animal()
    System.out.println("Dog constuctor");
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Dog obj = new Dog();
  }
}
