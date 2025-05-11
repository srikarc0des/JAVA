import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user which table to print
        System.out.print("Enter the table number you want to print: ");
        int table = scanner.nextInt();

        // Print that table up to 20
        for (int i = 1; i <= 20; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        scanner.close();
    }
}
