
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am good";
		String[]  str = s.split(" ");
		int count = str[0].length();
		
		for(int i=0;i<str.length;i++)
		{
			if(count<str[i].length())
			{
				count = str[i].length();
			}
		}
		System.out.println(count );
	
			System.out.println("######");
			for(int j=0;j<count-1;j++)
			{
				System.out.print("#");
				System.out.print(str[j]);
				System.out.print("#");
				System.out.println();
			}
			
			System.out.println("######");
	}

}
