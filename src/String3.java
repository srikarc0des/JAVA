
public class String3 {
	public static void main(String[] args) {
	String str1 = "srikar reddy";
	String str2 = "Srikar Reddy";
	
	System.out.println(str1.equals(str2));
	System.out.println(str1.equalsIgnoreCase(str2));
	System.out.println(str1.length());
	System.out.println(str2.indexOf("R"));
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.charAt(5));
	System.out.println(str1.isEmpty());
	System.out.println(str2.trim());
	System.out.println(str1.replace('s','M'));
	}

}
