
public class RotateElementGivenNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		//Number Of Rotation
		int n =3;
		
		for(int i=0;i<n;i++)
		{
			int first =ar[0];
			int j=0;
			for( j=0;j<ar.length-1;j++)
			{
				ar[j] =  ar[j+1];
			}
			ar[j] = first;
		}
		
		for(int i:ar)
		System.out.println(i);
				
	}

}
