package Lect9;
import java.util.*;

public class array_basics {

	public static void main(String[] args) {
		int[] arr=takeInput();
        display(arr);
        int max=Max(arr);
        int find=Find(arr,200);
       System.out.println("Max element is :" +max);
       System.out.println("Index of the element is : " +find);
	}

	public static int Find(int[] arr,int element) {
		//Find index of element in an array
		// if not found return -1
		 for(int i=0;i<=arr.length-1;i++) {
			 if(arr[i]==element) {
				 return i;
				 
			 }
			 
		 }
		 return -1;
	}
	
	public static int Max(int[] arr) {
		int chocolate=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>chocolate) {
				chocolate=arr[i];
			}
			
			
		}
		
		return chocolate;
	}

	public static int[] takeInput() {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter size of the array");
       int n=scn.nextInt();
       int[] arr=new int[n];
       System.out.println("Enter the elements of array");
       for(int i=0;i<=arr.length-1;i++) {
    	   arr[i]=scn.nextInt();
    	   
       }
		return arr;
	}

	public static void display(int[] arr) {
  		 for(int i=0;i<=arr.length-1;i++) {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
		
	}


}
