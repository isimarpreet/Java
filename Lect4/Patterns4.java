package Lect4;

public class Patterns4 {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}