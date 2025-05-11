import java.util.*;
public class Array5{
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a size of an array: ");
	 int size = sc.nextInt();
	 int numbers[] = new int[size];

	 //input
	 for(int i=0;i<size;i++) {
     numbers[i] = sc.nextInt();
		 
	 }
	 System.out.println("Enter a value from array to find its index");
	int x = sc.nextInt();
			 //output
    
			 for(int i=0;i<numbers.length;i++) {
			 if(numbers[i]==x) {
			 System.out.println("x is found in array index of :"+i);
}
}
}
}
