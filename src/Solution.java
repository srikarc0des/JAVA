import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and print 3 integers, each on a new line
        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            System.out.println(number);
        }

        scanner.close();
    }
}
