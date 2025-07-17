public class Employee_ {

  // private data members
  String name;
  int age;

  // public setter methods (to set values)
  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  // public getter methods (to get values)
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static void main(String[] args) {
    Employee_ obj = new Employee_();

    // Setting values using setters
    obj.setName("neha");
    obj.setAge(24);

    // Getting values using getters
    System.out.println("Name: " + obj.getName());
    System.out.println("Age: " + obj.getAge());

  }
}