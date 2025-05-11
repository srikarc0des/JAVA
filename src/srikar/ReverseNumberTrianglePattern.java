//8Q. Print a Reverse Number Triangle Pattern
package srikar;
import java.util.Scanner;

public class ReverseNumberTrianglePattern  {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = sc.nextInt();
     System.out.println("Reverse number triangle pattern for " + num);

     for (int i = num; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
             System.out.print(j + " ");
         }
         System.out.println();
     }

     sc.close();
 }
}
