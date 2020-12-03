

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0;
		double d = 0.0;
		
		String s ="";
		Scanner scan = new Scanner(System.in);
		
	i =	scan.nextInt();
	d = scan.nextDouble();
	scan.nextLine();
	s=scan.nextLine();
	System.out.println(4 + i);
	System.out.println(4.0 + d);
	System.out.println("HackerRank "+ s);
	}

}
