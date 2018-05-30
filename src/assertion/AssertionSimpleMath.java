package assertion;

public class AssertionSimpleMath {
	
	public static int sum(int a, int b) {
		assert(Integer.MAX_VALUE -a >=b) : "Value of " + a + " + " + b +
		" " + "is too large to add.";
		final int result = a + b;
		return result;
		
	}

}
