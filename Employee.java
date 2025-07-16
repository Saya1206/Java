public class Employee {

  String name;
  int id;

  Employee(String n, int i) {
    name = n;
    id = i;
  }

  void display() {
    System.out.println("Name: " + name + ", Id: " + id);
  }

  public static void main(String[] args) {
    Employee obj = new Employee("smita", 101);
    obj.display();
  }
}
