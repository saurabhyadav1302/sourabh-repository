package org.array;

public class LinearSearch {

	public static void main(String[] args) {
		int ar[]= {11,22,33,44,55,66,77,88,99,111};
		boolean flag =false;
		int keyElement=66;
		
		for(int i=0;i<ar.length;i++) {
			if(keyElement==ar[i]) {
				System.out.println("Element found at index position "+ i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("value does not exist in the array!!");
	
	}

	}}
