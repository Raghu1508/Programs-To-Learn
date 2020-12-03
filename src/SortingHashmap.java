import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm =new HashMap<Integer, String>();
		hm.put(6, "Tushar");  
		hm.put(12, "Ashu");  
		hm.put(5, "Zoya");  
		hm.put(78, "Yash");  
		hm.put(10, "Praveen");  
		hm.put(67, "Boby");  
		hm.put(1, "Ritesh");  
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		
		
		tm.forEach((k,v)->{
			System.out.println(k + " " + v);
		}
		);
		System.out.println("====================================");
		Iterator itr = tm.keySet().iterator();
		while(itr.hasNext())
		{
			int key = (int) itr.next();
			System.out.println(key + " " + tm.get(key));
		}
	}

}
