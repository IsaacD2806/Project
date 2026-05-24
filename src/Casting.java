public class Casting {
    public static void main(String[] args) {

        // from text to integer
        String num_text = "123";
        int num_integer = Integer.parseInt(num_text);
        System.out.println("Number integer: "+num_integer);

        // integer to text
        int integer = 465;
        String integer_text = String.valueOf(integer);
        System.out.println("Text: "+integer_text);

        // double to integer
        double num_double = 45.50;
        int double_integer = (int)num_double;
        System.out.println("Double to integer: "+double_integer);

        // from integer to double
        int integer2 = 798;
        double integer_double = (double)integer2;
        System.out.println("From integer to double: "+integer_double);
    }
}
