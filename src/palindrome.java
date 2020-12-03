
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Dam";
		String rev = "";
		char[] ch = s.toCharArray();
		
		int num = 12321;
		int temp =num;
		int revnum=0;
		int rem = 0;
		
		for(int i =ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrome ");
		}
		else
		{
			System.out.println("String is Not a Palindrome ");
		}
		
		while(num>0)
		{
			rem =num%10;
			revnum = revnum*10+rem;
			num  = num/10;
			
		}
		if(temp==revnum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palidrome");
		}
		
	}

}
