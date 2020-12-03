
public class VerifyStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aString = "abc";
		String bString = "abc";
		
		String cString = new String("abc");
		String dString = new String("abc");
		
		System.out.println(aString.equals(bString));
		System.out.println(aString.equals(cString));
		System.out.println(dString.equals(cString));
		
		System.out.println(aString == bString);
		System.out.println(aString == cString);
		System.out.println(dString == cString);
		

	}

}
