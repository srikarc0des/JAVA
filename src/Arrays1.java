import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();

        // Create an array with the given size
        double[] marks = new double[size];

        // Input marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        // Output marks
        System.out.println("\nMarks of all students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    } 
}
