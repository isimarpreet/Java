package lect7;

public class decimaltoBinary {

	public static void main(String[] args) {
       int decimal=14;
       int bin=0;
       int mult=1;
       while(decimal!=0) {
    	   int rem=decimal%2;
    	   bin+=rem*mult;
    	   mult*=10;
    	 //  System.out.println(rem);
    	   
    	   
    	   decimal=decimal/2;
       }
       System.out.println(bin);

	}

}
