package lect7;
import java.util.*;

public class InverseAnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int i=0;
		int op =1;  //original place
		while(n!=0){
		    int od= n % 10;
		    int id=op;   //inverted digit
		    int ip=od;  //inverted place
		    i=i+ id*(int)Math.pow(10,ip-1);
		    
		    n=n/10;
		    op++;
		    
		}System.out.println(i);

	}

}
