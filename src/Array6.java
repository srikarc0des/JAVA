import java.util.*;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare the array with user-specified size
        int[] numbers = new int[size];

        // Input: Populate the array with user inputs
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Ask the user for a value to search
        System.out.print("Enter a value to find its index in the array: ");
        int x = sc.nextInt();

        // Output: Search for the value and print its index if found
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Value " + x + " is found at index: " + i);
                found = true;
                break;  // Exit the loop after first match
            }
        }

        // If the value was not found
        if (!found) {
            System.out.println("Value " + x + " is not present in the array.");
        }

        sc.close();
    }
}
