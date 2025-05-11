import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        ReverseString obj = new ReverseString();
        String result = obj.reverse(input);

        System.out.println("Reversed string: " + result);
        
        sc.close(); // Good practice to close the scanner
    }

    String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            result += temp;
            //return result;
        }
        return result;
    }
}
