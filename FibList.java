//Author: Joshua Whitmore
//September 12 , 2020
//Coursera:Data Strucures and Algorithms

import java.util.Scanner;

public class FibList{

	//FibList method
	static long fibList(int n){
	 long[] array = new long[n+2];
	 array[0]=0;
	 array[1]=1;
	 //for loop adding fib numbers...
	 for(int i = 2;i<n+1;i++)
	 {
	 	array[i]=(array[i-1] + array[i-2]);
	 }//end of for
	/* System.out.print("Array after loop:");
	 for(int i = 0; i< array.length;i++){
	 System.out.println(array[i]);
	 }*/
	 return array[n];
	}//end fibList
	
	
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n  = kb.nextInt();
		
		System.out.println(fibList(n));
	}//end main
}//end fib class
