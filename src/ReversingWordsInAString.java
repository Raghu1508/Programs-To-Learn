

public class ReversingWordsInAString {
	
	public static void main(String[] args)
	{
		String s1 = "This is bangalore";
		//String[] ar1 = new String[5];
		
		String[] words = s1.split(" ");
		String reverseString = "";
		
		for(int i =0;i<words.length;i++)
		{
			String word = words[i];
			String reverseWordString = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWordString = reverseWordString+word.charAt(j);
			}
			
			reverseString+= reverseWordString + " ";
		}
		
		System.out.println(reverseString);
		
		

	}

}
