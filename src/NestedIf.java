import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the age input

        // Simple if statement
        if (age >= 18) {
            System.out.println("You are eligible for a driving license.");
        }

        // if-else statement
        if (age >= 18) {
            System.out.println("You can apply for a driving license.");
        } else {
            System.out.println("You are not eligible for a driving license.");
        }

        // Nested if statement
        if (age >= 16) {
            if (age < 18) {
                System.out.println("You can apply for a learner's license.");
            } else {
                System.out.println("You are eligible for a permanent license.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }

        // Close the scanner
        scanner.close();
    }
}
