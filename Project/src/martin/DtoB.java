package martin;
import java.util.Scanner;

public class DtoB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		String b =Integer.toBinaryString(a);
		System.out.println(b);
	}

}
