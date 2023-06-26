package org.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class ArrayDeclaration {

		public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Array declaration
			int[] ar=new int[10];
		
		
		//array initialization
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//static initialize
			int ar1[]= {11,22,33,44,55,66,77,88,99,111};
		
			for(int i=0;i<ar1.length;i++)
			{
				System.out.print(ar1[i]+" ");
			
			}
		
			System.out.println(ar1[5]);
		
		
		//dynamically 				
			for(int i=0;i<ar.length;i++)
			{
				System.out.println("Enter element at "+i+" index:");
				ar[i]=Integer.parseInt(br.readLine());
			}
		
		//display array elements
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			
			}

		}
	}
