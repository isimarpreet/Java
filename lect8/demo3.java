package lect8;

public class demo3 {
	public static void main(String[] args) {
		int n=add(10,15);
	 boolean ans=maggimilli(6,7);
	 String a=sayHi();
		System.out.println(n);
		System.out.println(ans);
		System.out.println(a);
	
	}
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static boolean maggimilli(int a,int b) {
	return a<b;
	}
	public static String sayHi() {
		return "Hi";
	}

}
