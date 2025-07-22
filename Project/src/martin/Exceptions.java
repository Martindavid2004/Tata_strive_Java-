package martin;

public class Exceptions {
	public static void main(String[] args) {
		try {
			int a=69/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic error => "+ e.getMessage());
		}

	}

}
