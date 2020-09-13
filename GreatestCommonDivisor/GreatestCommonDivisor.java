//Author Joshua Whitmore
//September 13, 2020

//#########################Problem Statement####################################
//Task. Given two integers a and b, find their greatest common divisor.
//Input Format. The two integers a, b are given in the same line separated by space.
//Constraints. 1 ≤ a, b ≤ 2 · 10 9 .
//Output Format. Output GCD(a, b).
import java.util.Scanner;
public class GreatestCommonDivisor {

	//use euclids algorithm
	public static int GCDEuclids(int a, int b){
		return a;
	}
	
	//Iterate trough all ints and mod 0, find greatest value
	//This is a naive slow solution I created to use for stress testing
	public static int GCDNaive(int a, int b){
		int[] intAmod = new int[a+1];
		int[] intBmod = new int[b+1];
		int[] divA = new int[a+1];
		int[] divB = new int[b+1];
		//fill array for int a
		for(int i = 0; i < intAmod.length;i++)
		{
			intAmod[i] = i;
			
		}
		for(int i = 0; i < intBmod.length;i++)
		{
			intBmod[i] = i;
			
		}
		
		int h = 0;
			//divide by i and if mod = 0 add to divA
		for(int i = 1; i < intAmod.length;i++)
		{
			if(a%intAmod[i]==0)
			{
				divA[h]=intAmod[i];
				h++;
			}
			
		}
		int j = 0;
		for(int i = 1; i < intBmod.length;i++)
		{
			if(b%intBmod[i]==0)
			{
				divB[j]=intBmod[i];
				j++;
			}
			
		}
		
		int gcd=0;
		if(divA.length<divB.length)
		{
			for(int i =0;i<divB.length;i++)
			{
				for(int k =0;k<divA.length;k++)
				{
					if(divB[i]==divA[k])
					{
						if(divB[i]>gcd)
						{
							gcd=divB[i];
						}
					}
				}
			}
		}
		if(divB.length < divA.length)
		{
			for(int i =0;i<divA.length;i++)
			{
				for(int k =0;k<divB.length;k++)
				{
					if(divB[k]==divA[i])
					{
						if(divB[k]>gcd)
						{
							gcd=divB[k];
						}
					}
				}
			}
		}
		
		
		
		System.out.println("GCD("+ a +"," + b+")= "+gcd);
	/*	for(int i = 0; i < intAmod.length;i++)
		{
			System.out.println(intAmod[i]);
		} */
		return gcd;
		
	}//end gcd
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		System.out.println(a);
		int b = kb.nextInt();
		System.out.println(b);	
		System.out.println(GCDNaive(a,b));
	}
}
