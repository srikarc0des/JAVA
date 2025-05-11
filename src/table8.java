

import java.util.Scanner;
public class table8 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		
		System.out.println("Enter a number which table you need :");
		int table =sc.nextInt();
		
		
		for(int i=1;i<=20;i++) {
		System.out.println(table + " X " + i + " = "+ (table*i) );
		
	}

}
}




