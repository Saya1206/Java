
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking a whole line as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

        // Taking string input (word only, stops at space)
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println(word);

        System.out.print(name + ", also tell me your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.print("Enter yout cgpa: ");
        float cgpa = sc.nextFloat();
        System.out.println(cgpa);
    }
}
