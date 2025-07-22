package martin;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A value :");
	int a=sc.nextInt();
	System.out.println("Enter b value :");
	int b=sc.nextInt();
	int temp;
	

		temp=a;
		a=b;
		b=temp;
		
		
	System.out.println("A:"+a);
	System.out.println("B:"+b);

	}

}
