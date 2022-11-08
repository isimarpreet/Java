package lect7;

public class rotateOfNumber {

	public static void main(String[] args) {
        int num=12345;
        int rot=5;
        
        int nod=0;   //number of digits
        int backup=num;
        while(num!=0) {
        	num/=10;
        	nod++;
        	
        }
        num=backup;
        int r=0;
        while(r<rot) {
        	int last=num%10;
        	
        int remNum=num/10;
        int rotatedNumber=last*(int)Math.pow(10 , nod-1)+remNum;
        	r++;
        	System.out.println(rotatedNumber);
        	num=rotatedNumber;
        	
        }
        

	}

}
