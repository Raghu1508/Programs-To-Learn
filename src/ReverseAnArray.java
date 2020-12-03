
public class ReverseAnArray {
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		int i = 0 , temp = 0;
		int j = a.length-1;
		while(i<j)
		{
			temp = a[i];
			a[i]= a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for(int n : a)
		{
			System.out.print(n +  " ");
		}
	}

}
