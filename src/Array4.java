import java.util.*;
public class Array4 {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.print("Enter size of an Array: ");
	int size = sc.nextInt();
	int numbers[]= new int[size];
	
	//input
	for(int i=0;i<size;i++) {
		numbers[i] = sc.nextInt();
	}
	int x =sc.nextInt();
	
	//output
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]==x) {
		System.out.println("x is found at index :" +i);
		
		}
	}
	
	
} 
}
