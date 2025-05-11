// 6Q. Print a right-angled triangle pattern of N stars
package srikar;
import java.util.Scanner;

public class RightAngledTriangleStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for pattern of stars: ");
        int num = sc.nextInt();

        System.out.println("Right-angled triangle pattern for " + num + " stars:");

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
