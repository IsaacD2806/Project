public class Concatenation {
    public static void main(String[] args) {
        String name, last_name;
        name = "Isaac";
        last_name = "Palomino";
        int value;
        value = 100;
        String word_1, word_2, greeting;
        word_1 = "learning";
        word_2 = "Java";
        greeting = word_1 +" "+ word_2;

        System.out.println("Name: "+name);
        System.out.println("Last_name: "+last_name);
        System.out.println("full name: "+name +" "+ last_name);
        System.out.println("Value: "+value);
        System.out.println(greeting);
        System.out.println(word_1.concat(word_2));
    }
}
