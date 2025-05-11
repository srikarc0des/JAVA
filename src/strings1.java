public class strings1 {
    public static void main(String[] args) {
        
        // String literals (stored in String pool)
        String str1 = "FLM";
        String str2 = "FLM";
        
        // String objects (stored in heap memory)
        String str3 = new String("FLM");
        String str4 = new String("FLM");
        
        // Comparisons
        System.out.println("Comparing String Literals:");
        System.out.println("str1 == str2 : " + (str1 == str2)); // true - same object in String pool
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true - same content
        
        System.out.println("\nComparing String Objects:");
        System.out.println("str3 == str4 : " + (str3 == str4)); // false - different objects in heap
        System.out.println("str3.equals(str4) : " + str3.equals(str4)); // true - same content
        
        System.out.println("\nComparing Literal and Object:");
        System.out.println("str1 == str3 : " + (str1 == str3)); // false - different memory locations
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true - same content
    }
}
