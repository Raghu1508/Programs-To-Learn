
public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,5,7,8,9,20};
		
		int small = a[0];
		int large = a[0];
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			else if(a[i]>large)
			{
				large =a[i];
			}
		}

		System.out.println("Small " +small);
		System.out.println("Large "+large);
	}

}
