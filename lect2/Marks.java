package lect2;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the marks from 100 : ");
		int marks=scn.nextInt();
		if(marks<=100 && marks>=80) {
			System.out.println("Grade is A");
			
		}else if(marks<=80 && marks >=60) {
         System.out.println("Grade is B");
         
		}else if(marks <=60 && marks>=50) {
			System.out.println("Grade is C");
			
		}else if(marks<=50 && marks>=40) {
			System.out.println("Grade is D");
			
		}else if(marks<=40 && marks>=30) {
			System.out.println("JUst pass");
		}else if (marks<=30){
			System.out.println("You are fail");
			
			
		}else {
			System.out.println("Null");
		}
		

	}

}
