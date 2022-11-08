package lect2;
import java.util.Scanner;

public class sum_using_while {
	public static void main(String [] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the value of n");
	int n=scn.nextInt();
	
	int sum= 0;
	
	int count =1;
	while(count<=n) {
		sum=sum+count;
		count+=1;
		
		
		
		
	
		
	}
	System.out.println("Sum= " +sum);
	}

}
