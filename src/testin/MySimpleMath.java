package testin;

public class MySimpleMath {
	public String checkSign(int number) {
		if (number >= 0)
			return "positive";
		else
			return "negativ";
	}

	public double divide(int num, int denom) {
	  if (denom == 0)
	  	throw new ArithmeticException("cannot divide by zero");
	  else 
	  	return num/ (double) denom;
	  }

}
