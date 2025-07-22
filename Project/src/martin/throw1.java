package martin;

public class throw1 {
	public static int DivideByZero(int a,int b) { 
		throw new ArithmeticException("Try to divide by 0");
		
	}

	public static void main(String[] args) {
		DivideByZero(69,0);

	}

}
