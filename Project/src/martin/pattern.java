package martin;
import java.util.regex.*;
import java.util.Scanner;


public class pattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1 = sc.nextLine().toLowerCase();
		String s2 = sc.nextLine().toLowerCase();
		boolean a = Pattern.matches(s1, s2);
		System.out.println(a);
	}
}