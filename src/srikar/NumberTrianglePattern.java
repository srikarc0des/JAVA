// 7Q. Print a Number Triangle Pattern
package srikar;
import java.util.Scanner;

public class NumberTrianglePattern {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number for pattern of numbers: ");
      int num = sc.nextInt();

  System.out.println("Right-angled triangle pattern for " + num + " numbers:");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // Move to next line after inner loop
        }

        sc.close();
    }
}
