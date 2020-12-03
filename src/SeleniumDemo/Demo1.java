package SeleniumDemo;

import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		
		String str = "I am an indian";
		
		
		//Reversing a word in string
		//input This is good   Output : sihT si doog
		reverseAWordInString(str);
		
		
		//Reverse the string
		//Input:This is good Output :  doog si sihT
		reverseAString(str);
		int[] num = {1,2,2,3,1};
		
		System.out.println(findShortestSubArray(num));
		
		
	}
	
	public static void reverseAString(String str)
	{
		String revString ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revString+=str.charAt(i	);
		}
		System.out.println(str);
		System.out.println(revString);
	}
	
	
	
	
	public static void reverseAWordInString(String str)
	{
		String[] words = str.split(" ");
		String reversedString = "";
		
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reveresWord = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				
				reveresWord+=word.charAt(j);
				
			}
		
			reversedString+=reveresWord+" ";

			
			
		}
		System.out.println(str);
		System.out.println(reversedString);
		
		
	}
	
	public static int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
           if (!map.containsKey(nums[i])){
               map.put(nums[i], new int[]{1, i, i});  // the first element in array is degree, second is first index of this key, third is last index of this key
           } else {
               int[] temp = map.get(nums[i]);
               temp[0]++;
               temp[2] = i;
           }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (value[0] > degree){
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree){
                res = Math.min( value[2] - value[1] + 1, res);
            } 
        }
        return res;
    }
	
	
}
