package org.array;

public class JaggedArrayExample {

	public static void main(String[] args) {

		//Declaring 2-D array with two rows
		int ar[][]=new int[3][];
		
		
		//First row will have three elements/columns
		ar[0]=new int[3];
		
		//second row will have four elements/columns
		ar[1]=new int[4];

		//second row will have four elements/columns
		ar[2]=new int[5];
		
		
		int count=0;
		//Array initialization
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
					ar[i][j]=count++;
			}
		}
		
		
		//Displaying jagged array
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
					System.out.print(ar[i][j]+"\t");
			}
			
			System.out.println();
		}
		
			
	}

}
