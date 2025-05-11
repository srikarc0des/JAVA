public class MethodsInString {

    public static void main(String[] args) {

        String s1 = "Java Programming";
        String s2 = "java programming";
        String s3 = "   Welcome   ";
        String s4 = "";
        String s5 = "   "; // blank string (only spaces)

        System.out.println("---- String Basic Methods ----");

        // 1. length()
        System.out.println("Length of s1: " + s1.length());

        // 2. charAt()
        System.out.println("Character at index 5: " + s1.charAt(5));

        System.out.println("\n---- String Comparison ----");

        // 3. equals()
        System.out.println("s1 equals s2: " + s1.equals(s2));

        // 4. equalsIgnoreCase()
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

        // 5. compareTo()
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        System.out.println("\n---- String Searching ----");

        // 6. contains()
        System.out.println("s1 contains 'Pro': " + s1.contains("Pro"));

        // 7. indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a'));
        System.out.println("Last Index of 'a': " + s1.lastIndexOf('a'));

        // 8. startsWith() and endsWith()
        System.out.println("s1 starts with 'Java': " + s1.startsWith("Java"));
        System.out.println("s1 ends with 'ing': " + s1.endsWith("ing"));

        System.out.println("\n---- String Modification ----");

        // 9. substring()
        System.out.println("Substring from index 5: " + s1.substring(5));
        System.out.println("Substring from 0 to 4: " + s1.substring(0, 4));

        // 10. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 11. replace()
        System.out.println("Replace 'a' with 'o': " + s1.replace('a', 'o'));
        System.out.println("Replace 'Programming' with 'Coding': " + s1.replace("Programming", "Coding"));

        System.out.println("\n---- Trimming and Splitting ----");

        // 12. trim()
        System.out.println("Before trim: '" + s3 + "'");
        System.out.println("After trim: '" + s3.trim() + "'");

        // 13. split()
        String[] words = s1.split(" ");
        System.out.println("Splitting words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\n---- Empty and Blank Checking ----");

        // 14. isEmpty()
        System.out.println("Is s4 empty? " + s4.isEmpty());

        // 15. isBlank() (new method)
        System.out.println("Is s4 blank? " + s4.isBlank()); // empty string
        System.out.println("Is s5 blank? " + s5.isBlank()); // only spaces

        System.out.println("\n---- Other Methods ----");

        // 16. join()
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("Joined String: " + joined);

        // 17. toCharArray()
        char[] charArray = s1.toCharArray();
        System.out.println("Characters in s1:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\n---- End of Program ----");
    }
}
