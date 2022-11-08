package lect7;

public class decimalToOctal {

	public static void main(String[] args) {
      int decimal=596;
      int oct=0;
      int multi=1;
      while(decimal!=0) {
    	  int rem=decimal%8;
    	  oct=oct+rem*multi;
    	  multi=multi*10;
    	  
    	  decimal=decimal/8;
      }
      System.out.println(oct);
      

	}

}
