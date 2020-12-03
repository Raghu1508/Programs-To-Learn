
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int c = 0;
		int temp = num;
		int rev,rem=0;
		while(num>0)
		{
			rem=num%10;
			c=(int) (c+Math.pow(rem, 3));
			
			num=num/10;
			
		}
		System.out.println(c);
		
		if(temp==c)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}

}
