package lect2;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scn.nextInt();
		
		int number=1;
		while(number<=n) {
			System.out.println(number);
			number+=1;
		}
		
		

	}

}
