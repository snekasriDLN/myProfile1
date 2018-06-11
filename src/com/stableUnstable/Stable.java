package com.stableUnstable;

public class Stable {
	public static void main(String[] args) {
		int arr[]= new int[10];
		int n=11223341;
		while (n!=0) {
		int	r=n%10;	
		arr[r] = arr[r]+1;
		n=n/10;
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]!=0) {
				System.out.println("stable");
			}
			else
				System.out.println("unstable");
			
		}
		
}
}