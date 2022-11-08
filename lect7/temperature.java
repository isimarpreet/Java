package lect7;

public class temperature {

	public static void main(String[] args) {
      int minF=0;
      int maxF=100;
      int step=20;
      for(int F=minF;F<=maxF;F+=step) {
    	  int C=(5*(F-32)/9);
    	  System.out.println(F + "\t" + C);
    	  
      }
      

	}

}
