package martin;
interface Calculator{
	int operator(int a,int b);
}

public class lambdaFunction {

	public static void main(String[] args) {
		Calculator add = (a,b) -> a+b;
		System.out.println("Sum of a and b : " + add.operator(10,20));
		
		
	}

}
