
import java.util.Scanner;

public class ArthmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Performing operations
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        
        if (b != 0) {
            System.out.println("Division (Quotient): " + (a / b));
            System.out.println("Modulus (Remainder): " + (a % b));
        } else {
            System.out.println("Division and Modulus not possible (division by zero)");
        }

        System.out.println("Increment of first number: " + (++a));
        System.out.println("Decrement of second number: " + (--b));

        sc.close();
    }
}

