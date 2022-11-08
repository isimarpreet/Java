package lect7;

public class binarytoDecimal {

	public static void main(String[] args) {
      int bin=101101110;
      int decimal=0;
      int mult=1;
      while(bin!=0) {
    	  int rem=bin%10;
    	  decimal=decimal+rem*mult;
    	  bin/=10;   
    	  mult*=2;
    	  
    	  
    	  
    	  
      }
      System.out.println(decimal);

	}

}
