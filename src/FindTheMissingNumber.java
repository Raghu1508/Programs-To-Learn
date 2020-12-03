

import java.util.Scanner;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {1,2,3,4,5,7,8};
		
		int n = a.length;
		
		int total = (n+1)*(n+2)/2;
		
		//System.out.println(total);
		
		int sumofArray =0;
		int missingNumber = 0;
		
		for(int i =0;i<n;i++)
		{
			sumofArray+=a[i];
		}
		
		missingNumber = total-sumofArray;
		System.out.println(missingNumber);

	}
	
	

}
