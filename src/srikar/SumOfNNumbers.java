// 3Q. Print the sum of first N natural numbers
package srikar;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int size = 0;

        for (int i = 1; i <= num; i++) {
            size = size + i;  // or: size += i;
        }

        System.out.print("Sum = " + size);
        sc.close();
    }
}
