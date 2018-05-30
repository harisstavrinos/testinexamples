package testin;

public class Testin {



	public static void main(String[] args) {
		MySimpleMath sm=new MySimpleMath();
		System.out.println("Input 0: " +  sm.checkSign(10));
		int x = 7; 
		System.out.println("Input -2: " +  sm.checkSign(-2));
		System.out.println("Input 0: " + sm.checkSign(0));
	}

}
