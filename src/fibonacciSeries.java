
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1 =0;
		int f2 =1;
		int n =10;
		
		
		
		for(int i =0;i<n;i++)
		{
			System.out.println(f1+ " ");
			int f3 = f1 +f2;
			f1=f2;
			f2=f3;
			
			
		}
	}

}
