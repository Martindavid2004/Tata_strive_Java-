package martin;
import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {
		int n=10;
		Integer n1=n;
		System.out.println(n1);
		
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(n1);
		int n2 = n1;
		System.out.println(n2);
		System.out.println(n1);
		}

}
 