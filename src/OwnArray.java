import java.util.Scanner;

public class OwnArray {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter a Size of an Array: ");
		int size = sc.nextInt();

	
	int[] marks = new int[size];
	
	
	//input marks
	for(int i=0;i<marks.length;i++) {
		System.out.print("Enter a marks of a student " + (i+1) + ": ");
	    marks[i]= sc.nextInt();
	    
	    }
	 // Output marks
    System.out.println("\nMarks of all students:");
    for (int i = 0; i < marks.length; i++) {
        System.out.println("Student " + (i+15
        		) + ": " + marks[i]);
    }
	
   }
	
	
}

