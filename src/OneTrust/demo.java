package OneTrust;

import java.util.ArrayList;
import java.util.HashMap;

public class demo {
	public static void main (String[] args)
	{
			//Using Collections
			// A code to reverse a string .
			// I am an Indian
			// n ai dn inamai
		
		String s = "I am an Indian";
		String rev = "";
		
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
	
		char[] c1 =s.toCharArray();
	
		
		int i = 0;
		int j = c1.length - 1;
		while (i < c1.length/2) {
			
			boolean flg = false;
			if (c1[i] == ' ') {
				i = i + 1;
				flg = true;
			}
			if (c1[j] == ' ') {
				j = j - 1;
				flg = true;
			}
			if (flg == false) {
				char tmp = c1[i];
				c1[i] = c1[j];
				c1[j] = tmp;
				i = i + 1;
				j = j - 1;
			}
			
			
		}

		
		for(char c : c1)
		{
			System.out.print(c);
		}

		
	}
}
