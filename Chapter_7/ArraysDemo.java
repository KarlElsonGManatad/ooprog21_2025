package Chapter_8;

import java.util.Arrays;

public class ArraysDemo {

    // Method to display array contents with a message
    public static void display(String message, int array[]) {
        System.out.print(message + "  ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create array of size 5 (default values = 0)
        int[] numbers = new int[5];

        // Display original array
        display("Original array:", numbers);

        // Fill the array with value 8
        Arrays.fill(numbers, 8);
        display("After filling with 8s:", numbers);

        // Change two elements (example in the output: index 1 → 6, index 4 → 3)
        numbers[1] = 6;
        numbers[4] = 3;
        display("After changing two values:", numbers);

        // Sort the array
        Arrays.sort(numbers);
        display("After sorting:", numbers);
    }
}
