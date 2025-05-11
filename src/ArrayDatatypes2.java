import java.util.Scanner;

public class ArrayDatatypes2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arrays: ");
        int size = sc.nextInt();

        // Declare arrays
        byte[] byteArray = new byte[size];
        short[] shortArray = new short[size];
        int[] intArray = new int[size];
        long[] longArray = new long[size];
        float[] floatArray = new float[size];
        double[] doubleArray = new double[size];
        char[] charArray = new char[size];
        boolean[] booleanArray = new boolean[size];
        String[] stringArray = new String[size];

        // Input and display
        inputArray(sc, byteArray, "byte");
        inputArray(sc, shortArray, "short");
        inputArray(sc, intArray, "int");
        inputArray(sc, longArray, "long");
        inputArray(sc, floatArray, "float");
        inputArray(sc, doubleArray, "double");
        inputCharArray(sc, charArray);
        inputBooleanArray(sc, booleanArray);
        inputStringArray(sc, stringArray);

        // Display output
        System.out.println("\n--- Stored Values ---");
        displayArray(byteArray, "byte");
        displayArray(shortArray, "short");
        displayArray(intArray, "int");
        displayArray(longArray, "long");
        displayArray(floatArray, "float");
        displayArray(doubleArray, "double");
        displayArray(charArray, "char");
        displayArray(booleanArray, "boolean");
        displayArray(stringArray, "String");

        sc.close();
    }

    // Generic input methods
    public static void inputArray(Scanner sc, byte[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextByte();
        }
    }

    public static void inputArray(Scanner sc, short[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextShort();
        }
    }

    public static void inputArray(Scanner sc, int[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void inputArray(Scanner sc, long[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextLong();
        }
    }

    public static void inputArray(Scanner sc, float[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextFloat();
        }
    }

    public static void inputArray(Scanner sc, double[] arr, String type) {
        System.out.println("\nEnter " + type + " values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(type + "[" + (i + 1) + "]: ");
            arr[i] = sc.nextDouble();
        }
    }

    public static void inputCharArray(Scanner sc, char[] arr) {
        System.out.println("\nEnter char values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("char[" + (i + 1) + "]: ");
            arr[i] = sc.next().charAt(0);
        }
    }

    public static void inputBooleanArray(Scanner sc, boolean[] arr) {
        System.out.println("\nEnter boolean values (true/false):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("boolean[" + (i + 1) + "]: ");
            arr[i] = sc.nextBoolean();
        }
    }

    public static void inputStringArray(Scanner sc, String[] arr) {
        System.out.println("\nEnter string values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("String[" + (i + 1) + "]: ");
            arr[i] = sc.next();
        }
    }

    // Generic display methods
    public static void displayArray(byte[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(short[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(int[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(long[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(float[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(double[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(char[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(boolean[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }

    public static void displayArray(String[] arr, String label) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(label + "[" + (i + 1) + "]: " + arr[i]);
        }
    }
}
