package org.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int row,col;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter number of rows:");
		row=Integer.parseInt(br.readLine());
		
		System.out.println("Enter number of columns:");
		col=Integer.parseInt(br.readLine());
		
		
		int ar[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the element value :");
				ar[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}