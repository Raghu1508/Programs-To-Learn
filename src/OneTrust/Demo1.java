package OneTrust;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args)
	{
		//Welcome to Bangalore
		
		String s = "Welcome to Bangalore";
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] ch = s.toCharArray();
		
		for(char c : ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
	
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
		mp.forEach((k,v) ->{
			if(v>1) {
				System.out.println(k + " "+ v);
			}
			
		
		});
		
//			for(Map.Entry<Character, Integer> entry :mp.entrySet())
//			{
//				if(entry.getValue() > 1)
//				{
//					System.out.println(entry.getKey() + entry.getValue());
//				}
//			}
		
	}
}
