import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Substrings: ");
        for (int i = 0; i < input.length()-1; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                System.out.print(substring + " ");
            }
        }

        sc.close();
    }
}
