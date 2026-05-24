import java.util.Scanner;

public class Input_Data {
    public static void main(String[] args) {
        String name;
        int age;

        //data entry
        Scanner entrance = new Scanner(System.in);
        System.out.println("Write your name...");
        name = entrance.next();
        System.out.println("Write your age...");
        age = entrance.nextInt();

        // Data output
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
