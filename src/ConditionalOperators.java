

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		//System.out.println(n%2==1 ||(n>=6 && n < 21) ? "Weird" : "Not Weird");
		
		if(n%2==1)
		{
			System.out.println("Weird");
		}
		else 
		{
			
			 if(n>=6 && n<21)
			{
				System.out.println("Weird");
			}
			else
			{
				System.out.println("Not Weird");
			}
		}
		
		
		
	}

}
