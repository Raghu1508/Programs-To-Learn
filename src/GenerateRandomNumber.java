import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		// TODO Auto-generated method stub
		int r1 = 5;
		double n = (int) (Math.random()*r1+5);
		System.out.println("Using Math.Random "+n);
		
		int x = r.nextInt(10);
		
		System.out.println("Using Random class " +x);
	}

}
