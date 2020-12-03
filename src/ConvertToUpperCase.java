
public class ConvertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str= new StringBuffer("india");
		char c = 'i';
		
		str.setCharAt(0, 'I');
		System.out.println(str);
		
//		convertOpposite(str); 
//        
//        System.out.println(str); 
		
	}
	static void convertOpposite(StringBuffer str) 
    { 
       int ln = str.length(); 
            
       // Conversion using predefined methods 
       for (int i=0; i<ln; i++) 
       { 
           Character c = str.charAt(i); 
           if (Character.isLowerCase(c)) 
               str.replace(i, i+1, Character.toUpperCase(c)+""); 
           else
               str.replace(i, i+1, Character.toLowerCase(c)+""); 
            
       } 
    } 

}
