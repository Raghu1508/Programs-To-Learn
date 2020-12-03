

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "angel";
		String s2 = "angle";
		int[] arr = new int[26];
		
		int temp1 =0;
		int temp2 = 0;	
		for(int i =0;i<s1.length();i++)
		{
			temp1=s1.charAt(i)-'a';  
			arr[temp1]++;
			temp2=s2.charAt(i)-'a';
			arr[temp2]--;
			
		}
		
		boolean flag = true;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				flag = false;
			}
		}
		
		if(flag)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}

}
