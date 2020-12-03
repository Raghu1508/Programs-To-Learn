import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,8,3,2,2,2,5,1};
		int[] fr = new int[ar.length];
		
		int small = ar[0];
		int visited =-1;
		for(int i =0;i<ar.length;i++)
		{
			int count =1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					fr[j]= visited;
				}
			}
			if(fr[i]!= visited)
			{
				fr[i]=count;
			}
		}
		
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + ar[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
        
        
        sortingArray(ar);
	}
	
	
	static void sortingArray(int[] ar)
	{
		Map<Integer,Integer> mp = new LinkedHashMap<Integer, Integer>();
		
		for(int i =0;i<ar.length;i++)
		{
			if(mp.containsKey(ar[i]))
			{
				mp.put(ar[i], mp.get(ar[i])+1);
			}
			else
			{
				mp.put(ar[i],1);
			}
		}
		
//		//Construct an ArrayList called listOfEntry holding all Entry objects of elementCountMap.
//		ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<Map.Entry<Integer,Integer>>(mp.entrySet());
//		
//			
//			//Sort listOfEntry based on values of Entry objects using Collections.sort()by passing customized Comparator.
//			Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() 
//            {
//                @Override
//                public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
//                {
//                    return o2.getValue().compareTo(o1.getValue());
//                }
//            });
			 //Print sorted array elements in descending order of their frequency
//	         
//	        System.out.println("Input Array : "+Arrays.toString(ar	));
//	         
//	        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
//	         
//	        System.out.print("[ ");
//	         
//	        for (Entry<Integer, Integer> entry : listOfEntry) 
//	        {
//	            int frequency = entry.getValue();
//	             
//	            while (frequency >= 1)
//	            {
//	                System.out.print(entry.getKey()+" ");
//	                 
//	                frequency--;
//	            }
//	        }
//	         
//	        System.out.print("]");
		
		
		 //Create an ArrayList to hold sorted elements
        
        ArrayList<Integer> sortedElements = new ArrayList<>();
			
			  //Java 8 code to sort elementCountMap by values in reverse order
	        //and put keys into sortedElements list
	         
	        mp.entrySet()
	                        .stream()
	                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	                        .forEach(entry -> { 
	                            for(int i = 1; i <= entry.getValue(); i++) 
	                            	sortedElements.add(entry.getKey());
	                                });
	         
	        //Printing sorted array elements in descending order of their frequency
	         
	        System.out.println("Input Array :"+Arrays.toString(ar));
	         
	        System.out.println("Sorted Array Elements In Descending Order Of their Frequency :");
	         
	        System.out.println(sortedElements);
	    }
	 
	
	

}
