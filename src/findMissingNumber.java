
public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,6,7,8};
		int sum1 =0;
		int sum2=0;
		int n = a.length+1;
		
		
		for(int i =0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		
		
		sum2=(n*(n+1))/2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2-sum1);
	}

}
