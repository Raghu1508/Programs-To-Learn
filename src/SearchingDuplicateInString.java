
public class SearchingDuplicateInString {
	public static void main(String[] args) {
		String string = "HelloTom";
//		char[] ch = {'a','b','c','d','e','f'};
//		String str = new String(ch);
//		
//		System.out.println(str);
		
		String nString = string.replace(" ", "");
		
		//int[] duplicate = new int[26];
		
		
		for(int i =0;i<nString.length()-1;i++)
		{
			int count =1;
			for(int j = i+1 ; j<nString.length()-1;j++)
			{
				if(nString.charAt(i)  == nString.charAt(j) )
				{
					//System.out.println( string.charAt(i) + "  " + string.charAt(j));
					count++;
				}
			}
			if(count>1)
			{
				System.out.println( nString.charAt(i) + "  " + count);
			}
		}
		
		
	}

}
