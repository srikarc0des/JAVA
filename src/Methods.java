
public class Methods {
public static void main(String[] args) {
	
	Methods t = new Methods();
	int result =t.sumOfTwoNumbers(10,20);
	System.out.println(result/2);
	t.division(result);
	
}
	
	int sumOfTwoNumbers(int a,int b) {
		int c =a+b;
		System.out.println(c);
		return c;
	}
	void division(int a) {
		int div =a/2;
		
		System.out.println(div);
		


}}


