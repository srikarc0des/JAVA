
public class UnaryOperators {
	public static void main(String[] args) {
		
		
		int a =10;
		int b=20;
		
		
		
	    System.out.println(-a);
		System.out.println(-b);
		
		boolean flag= false;
		System.out.println(!flag);
		boolean notFlag= !flag;
		System.out.println(notFlag);
		
		a=15;
		b=20;
		
		
	
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(++b);
		
		a=5;
		b=10;
		long value2=a++ + --b *++a;
		System.out.println(++b);
		
		
}
}
