
public class FindLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		int temp=0;
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Largest Number is " +a[a.length-1]);
		System.out.println("Second Largest Number is " +a[a.length-2]);
		System.out.println("Third Largest Number is " +a[a.length-3]);
	}

}
