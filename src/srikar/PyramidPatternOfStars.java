// 8Q. Print a Pyramid Pattern of Stars
package srikar;
import java.util.Scanner;

public class PyramidPatternOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Pyramid pattern for " + num + " rows:");

        for (int i = 0; i <= num; i++) {
            // Print spaces
            for (int j = 0; j <= num - i; j++) {
            	
            	
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line

         System.out.println();
        }

        sc.close();
    }
}
