package org.array;

public class BinarySearch {

	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55,66,77,88,99,111};
		
		int keyElement=61;
		int low=0,high=ar.length-1;
		boolean flag=false;
		
		while(low<=high)
		{
			
			int mid=low+(high-low)/2; //mid=low+high/2
			
			if(keyElement==ar[mid])
			{
				flag=true;
				System.out.println("value found at "+mid +" index");
				break;
				
			}
			else if(keyElement>ar[mid])
			{
				low=mid+1;
			
			}
			else 
			{
				high=mid-1;
			}
	
		}
		
		if(flag==false)
		{
			System.out.println("value does not exist in the array!!");
		}
	}

}