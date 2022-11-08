package Lect4;

public class FibonacciNumbers {
	public static void main( String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
		
		int n=10;
		int count=1;
		
		while(count<=n) {
		 n3=n1+n2;
		 n1=n2;
		 n2=n3;
		 count++;
		}
		System.out.println(n1);
	//	System.out.println(n2);
		
	}

}
