  import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER YOUR NUMBER : ");
       int num =sc.nextInt();
       
       if( num%2==0) {
    	  System.out.println("This is a Even Number");
       }else {
    	   System.out.println("This is a Odd Number");
    		
    	}
     }
    
}


