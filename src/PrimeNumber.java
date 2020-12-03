import java.text.SimpleDateFormat;
import java.util.Date;

public class PrimeNumber {
	
	public static void main(String[] args)
	
	{
		//System.out.println(getDates(15));
		
		int a = 11;
		boolean flag = false;
		
		for(int i =2;i<a/2;i++)
			
		{
			if(a%i==0)
			{
				flag = true;
			}
		}
		
		if(flag)
			System.out.println("Num is not a  prime ");
		else
			System.out.println("Number is prime");
		
	}
	
//	public static String getDates(int noOfDays)
//	{
//		SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
//	    Date date = new Date();
//	    String todaysDate = dateFormat.format(date);
//	    System.out.println(todaysDate);
//
//	    String day=todaysDate.substring(0,2);
//	    String month=todaysDate.substring(3,5);
//	    String year = todaysDate.substring(6,9);
//
//	    int monthValue=Integer.parseInt(month); 
//	    int dayValue=Integer.parseInt(day); 
//	    int yearValue = Integer.parseInt(year);
//	    
//
//	    if(noOfDays+dayValue>31)
//	    {
//	        int temp= 31-dayValue;
//	        dayValue=14-temp;
//	        monthValue=monthValue+1;
//	    }
//	    else
//	    {
//	        dayValue=dayValue+14;
//	    }
//	    String newDay = dayValue+"/"+monthValue+"/"+"/"+yearValue+"/";
//	    System.out.println(newDay);
//	    return newDay;
//		
//	}

}
