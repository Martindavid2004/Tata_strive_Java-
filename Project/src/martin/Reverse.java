package martin;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine().toLowerCase();
		String r="";
		for (int i=s.length()-1;i>=0;i--) {
			
			r+=s.charAt(i);
	}
		if(s.equals(r)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

}
}