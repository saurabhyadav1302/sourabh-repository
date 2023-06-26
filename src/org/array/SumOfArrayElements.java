package org.array;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int ar[]= {11,22,33,44,55,66,77,88,99,111};
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("sum="+sum);
		
		//print array elements in reverse order
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		
		

	}

}
