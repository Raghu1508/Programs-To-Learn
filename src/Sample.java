

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Occurence of a character
		
		String hString = "Happy";
		System.out.println(hString.contains("appy"));
		
		//Reversing an array
		int[] ar = {1,3,5,7,9};
		int[] ar2;
		int start = 0;
		int end = ar.length-1;
		int temp;
		while(start<end)
		{
			temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
		
		for(int n : ar)
		{
			System.out.print(n + " ");
		}
		
		
		
		String name = "I Love Java";
		String revNameString = ""; //avaJ evoL I
	//String updatedString=	name.toUpperCase();
//		System.out.println(name);
		String[] revString = name.split(" ");
		String rev="";
		for(int i = revString.length-1;i>=0;i--)
		{
			rev += revString[i] + " ";
		}
				
		for(int i = name.length()-1;i>=0;i--)
		{
			revNameString=revNameString+name.charAt(i);
		}

		System.out.println(rev);
		System.out.println(revNameString);
	}

}
