package martin;

import java.util.*;

public class HashMap1 {
	
		public static void main(String[] args) {

		TreeMap <String,Integer> t = new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no of Fruits : ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print("Enter a name of fruit : ");
			String name =sc.next();
			System.out.print("Enter a count of fruit : ");
			int count = sc.nextInt();
			t.put(name,count);
		}
System.out.println(t);
		
	}
}