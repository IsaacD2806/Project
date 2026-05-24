import java.util.Scanner;

public class Arithmetic_Oper {
    public static void main(String[] args) {
        int value1, value2, result;
        Scanner entrance = new Scanner(System.in);

        // Data entry
        System.out.println("Enter value 1...");
        value1 = entrance.nextInt();
        System.out.println("Enter value 2...");
        value2 = entrance.nextInt();

        // Sum operation
        result = value1 + value2;
        System.out.println("Suma: "+result);

        // Subtraction operation
        result = value1 - value2;
        System.out.println("Subtraction: "+result);

        // Multiply operation
        result = value1 * value2;
        System.out.println("Multiply: "+result);

        //Division operation
        result = value1 / value2;
        System.out.println("Difference: "+result);

        // Residue operation
        result = value1 % value2;
        System.out.println("Residue: "+result);
    }
}
