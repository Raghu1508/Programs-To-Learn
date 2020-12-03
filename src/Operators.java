

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(12.00, 20, 8);
	}
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
	      int tip = (int) Math.round(meal_cost*tip_percent/100);

	      int tax = (int) Math.round(meal_cost *tax_percent/100);

	        int totalCost = (int) (meal_cost + tip + tax);
	        System.out.println(totalCost);

	    }

}
