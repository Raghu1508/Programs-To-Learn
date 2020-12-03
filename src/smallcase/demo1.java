package smallcase;

public class demo1 {

	public static void main (String[] args) {
	String str = "1@R2a#g3h#v4e$n5d6r7a8R9a0t&h*o%r*e(2.50+3.50)";
	
	int smallalpha ;
	int bigalpha ;
	int isNumber ;
	String alpha = "";
	String num = "";
	String special = "";
	
	for(int i=0;i<str.length();i++)
	{
		if((str.charAt(i) >= 'a' && str.charAt(i) <='z') || (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z'))
		{
			alpha=alpha+str.charAt(i);
		}
		else if(str.charAt(i) >= '0' && str.charAt(i)<='9')
		{
			num=num+str.charAt(i);
		}
		else
		{
			special+=str.charAt(i);
		}
			
	}
	
	
//	for(int i=0;i<str.length();i++)
//	{
//		smallalpha = str.charAt(i)-'a';
//		bigalpha = str.charAt(i)-'A';
//		isNumber = str.charAt(i)-'0';
//		
//		if(smallalpha>=0 && smallalpha<=25)
//		{
//			//System.out.println("Small");
//			alpha=alpha+str.charAt(i);
//			
//		}
//		else if(bigalpha>=0 && bigalpha<=25)
//		{
//			System.out.println("Big ");
//			alpha=alpha+str.charAt(i);
//		}
//		else if(isNumber>=0 && isNumber<=9)
//		{
//			//System.out.println("Numeric");
//			num=num+str.charAt(i);
//		}
//		else
//		{
//			//System.out.println("Specialcharacter");
//			special = special+str.charAt(i);
//			
//		}
//	}
	

//	
//	for(int i=0;i<str.length();i++)
//	{
//			
//		if(Character.isAlphabetic(str.charAt(i)))
//		{
//			alpha=alpha+str.charAt(i);
//		}
//		else if (Character.isDigit(str.charAt(i)))
//		{
//			num = num +str.charAt(i);
//		}
//		else
//		{
//			special=special+str.charAt(i);
//		}
//	}
	
	
	
	System.out.println(alpha + " " + num + " "+special);
	}
	
	
	
	
}


//String 1@R2a#g3h#v4e$n5d6r7a8R9a0t&h*o%r*e(2.50+3.50)