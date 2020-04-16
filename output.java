import java.util.*;
public class MathComputation {
	// BEGIN: required for external functions
	public static interface Externals {
		public int pow(int a, int b);
		public int triple(int c, int d, int e);
	}
	private Externals externals;
	public MathComputation(Externals _externals) {
	    externals = _externals;
	}
	// END: required for external functions
	
	public void calculate() {
		System.out.println("Plus = " + (2 + 3));
		System.out.println("Minus = " + (56 - 1));
		System.out.println("Mult = " + (5 * 5));
		System.out.println("Division = " + (9 / 6));
		System.out.println("Everything = " + (4 + 3 * 7 / 2 - 1));
		System.out.println("Negative = " + (4 + 1));
		System.out.println("parenthesis = " + ((4 + 1) * 3));
	    // BEGIN: external functions only
		System.out.println("calculate_power_of_2 = " + (externals.pow(4, 2)));
		System.out.println("add_three_numbers = " + (externals.triple(5, 5, 5)));
	    // END: external functions only
		
	}
}
