void main() {

    int valor1 = 5;
    System.out.println("Value original: " + valor1);

    // Increase value postfix
    valor1++;
    System.out.println("Value increase: " + valor1);

    // Increase value prefix
    ++valor1;
    System.out.println("Value increase: " + valor1);

    int value2 = 6;
    System.out.println("Value original: " + value2);

    // Decrement postfix
    value2--;
    System.out.println("Value decrement: " + value2);

    // Decrement prefix
    --value2;
    System.out.println("Value decrement: " + value2);

    int value3 = 10;
    System.out.println("Value original: " + value3);

    // Increase operation fixed (multiplication)
    value3 *= 2;
    System.out.println("Value increase: " + value3);

    // Decrement operation fixed (division)
    value3 /= 2;
    System.out.println("Value decrement: " + value3);
}