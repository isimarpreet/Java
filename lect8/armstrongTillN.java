package lect8;

public class armstrongTillN {
	
	public static void main(String[]args) {
		printArmStrongNumbers(1000);
	}
		public static void printArmStrongNumbers(int n) {
			for(int i=1;i<=n;i++) {
				if (isArmstrong(i)){
					System.out.println(i);
				}
			}
		}
		public static boolean isArmstrong(int num) {
			int nod=numberOfDigits(num);
			int sum=0;
			int backup=num;
			while(num!=0) {
				int digit=num%10;
				num/=10;
				sum=sum+(int)Math.pow(digit,nod);
				
			}
			return backup==sum;
		}
		public static int numberOfDigits(int num) {
			int count=0;
			while(num!=0) {
				num=num/10;
				count++;
				
			}
			return count;
		}
	

}
