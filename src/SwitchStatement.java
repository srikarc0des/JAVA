import java.util.Scanner;

public class  SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Display a simple menu
       /* System.out.println("Choose a license type:");
        System.out.println("1. Learner's License");
        System.out.println("2. Permanent License");
        System.out.println("3. International License");
        System.out.print("Enter your choice (1-3): ");*/
        System.out.print("Enter Floor :");
        
        int num = scanner.nextInt();

        // switch statement to handle user choice
        switch (num) {
            case 1:
                System.out.println("1st floor");
                break;
            case 2:
                System.out.println("2nd floor");
                break;
            case 3:
                System.out.println("3rd floor");
                break;
            default:
                System.out.println("Unknown floor");
            case 5:
                System.out.println("5rd floor");
        }

        scanner.close();
    }
}


