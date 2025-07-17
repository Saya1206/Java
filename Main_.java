class Animal {
  void eats() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barking...");
  }
}

class Puppy extends Dog {
  void weep() {
    System.out.println("Weeping...");
  }
}

public class Main_ {
  public static void main(String[] args) {
    Puppy obj = new Puppy();

    obj.weep();
    obj.bark();
    obj.eats();
  }
}
