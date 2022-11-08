package lect2;
import java.util.Scanner;

public class maxOf3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scn.nextInt();
		System.out.println("Enter the value of b");
		int b=scn.nextInt();
		System.out.println("Enter the value of c");
		int c=scn.nextInt();
		if(a>b && a>c) {
			System.out.println("Maximum is : " + a);
			
		}else if(c>a && c>b) {
			System.out.println("Maximum is : " + c);
			
		}
		else if(a==c && a==b && b==c) {
			System.out.println("All are equal");
			
		}
		else {
			System.out.println("Maximum is : " + b);
		}
	}

}
