import java.util.Scanner;

public class ArrayDatatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the size of arrays: ");
        int size = sc.nextInt();

        // Declare arrays for all 9 data types
        byte[] byteArray = new byte[size];
        short[] shortArray = new short[size];
        int[] intArray = new int[size];
        long[] longArray = new long[size];
        float[] floatArray = new float[size];
        double[] doubleArray = new double[size];
        char[] charArray = new char[size];
        boolean[] booleanArray = new boolean[size];
        String[] stringArray = new String[size];

        // Input values for each data type
        System.out.println("\nEnter byte values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Byte[" + (i + 1) + "]: ");
            byteArray[i] = sc.nextByte();
        }

        System.out.println("\nEnter short values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Short[" + (i + 1) + "]: ");
            shortArray[i] = sc.nextShort();
        }

        System.out.println("\nEnter int values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Int[" + (i + 1) + "]: ");
            intArray[i] = sc.nextInt();
        }

        System.out.println("\nEnter long values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Long[" + (i + 1) + "]: ");
            longArray[i] = sc.nextLong();
        }

        System.out.println("\nEnter float values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Float[" + (i + 1) + "]: ");
            floatArray[i] = sc.nextFloat();
        }

        System.out.println("\nEnter double values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Double[" + (i + 1) + "]: ");
            doubleArray[i] = sc.nextDouble();
        }

        System.out.println("\nEnter char values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Char[" + (i + 1) + "]: ");
            charArray[i] = sc.next().charAt(0);
        }

        System.out.println("\nEnter boolean values (true/false):");
        for (int i = 0; i < size; i++) {
            System.out.print("Boolean[" + (i + 1) + "]: ");
            booleanArray[i] = sc.nextBoolean();
        }

        System.out.println("\nEnter string values:");
        for (int i = 0; i < size; i++) {
            System.out.print("String[" + (i + 1) + "]: ");
            stringArray[i] = sc.next();
        }

        // Output the stored values
        System.out.println("\n--- Stored Values ---");

        System.out.println("\nByte values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Byte[" + (i + 1) + "]: " + byteArray[i]);
        }

        System.out.println("\nShort values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Short[" + (i + 1) + "]: " + shortArray[i]);
        }

        System.out.println("\nInt values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Int[" + (i + 1) + "]: " + intArray[i]);
        }

        System.out.println("\nLong values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Long[" + (i + 1) + "]: " + longArray[i]);
        }

        System.out.println("\nFloat values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Float[" + (i + 1) + "]: " + floatArray[i]);
        }

        System.out.println("\nDouble values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Double[" + (i + 1) + "]: " + doubleArray[i]);
        }

        System.out.println("\nChar values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Char[" + (i + 1) + "]: " + charArray[i]);
        }

        System.out.println("\nBoolean values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Boolean[" + (i + 1) + "]: " + booleanArray[i]);
        }

        System.out.println("\nString values:");
        for (int i = 0; i < size; i++) {
            System.out.println("String[" + (i + 1) + "]: " + stringArray[i]);
        }

        sc.close();
    }
}
