package ch_01_VariablesAndDataTypes;

public class Q5 {

    // Problem:
    // Create an Integer[] array
    // Print default values (null)
    // Update some values
    // Compute sum ignoring nulls

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];  // default → null

        System.out.println("Default values:");
        for (Integer val : arr) {
            System.out.println(val);
        }

        // update using Integer object
        arr[5] = Integer.valueOf(5);
        arr[2] = 10;
        arr[8] = 15;

        int sum = 0;

        for (Integer val : arr) {
            if (val != null) {      // null check REQUIRED
                sum += val;
            }
        }

        System.out.println("Sum (ignoring nulls) = " + sum);
    }
}
