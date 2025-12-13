package ch_01_VariablesAndDataTypes;

public class Q4 {

    // Problem:
    // Read int, float, double, char.
    // Calculate:
    //     result = intVar + floatVar * 2 - (doubleVar / 2) + charVar
    // Print result as: int, float, double.

    public static void main(String[] args) {

        int intVar = 5;
        float floatVar = 2.0f;
        double doubleVar = 5.55;
        char charVar = 'a';   // ASCII = 97

        // Step 1: Raw result (default = double)
        double raw = intVar + floatVar * 2 - (doubleVar / 2) + charVar;

        // Step 2: Convert to int / float / double
        int resultInt = (int) raw;
        float resultFloat = (float) raw;
        double resultDouble = raw;   // no cast needed

        System.out.println("As int: " + resultInt);
        System.out.println("As float: " + resultFloat);
        System.out.println("As double: " + resultDouble);
    }
}
