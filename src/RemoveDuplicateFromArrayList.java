

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Using Set
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,7,8,1,9)) ;
		
		
		HashSet<Integer> sortingNum = new HashSet<Integer>(num);
		
		ArrayList<Integer> sortedNum = new ArrayList<Integer>(sortingNum);
		
		System.out.println(sortedNum);
		
		num.clear();
		System.out.println(num);
		
		//Using Stream
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,7,8,1,9)) ;
		
		List<Integer> sorted = num1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(sorted);
		
		
		
		
	}

}
