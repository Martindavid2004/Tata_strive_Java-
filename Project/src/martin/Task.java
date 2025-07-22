package martin;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.nextLine().toLowerCase();
		int count=0;
		int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
		for (int i=0;i<a.length();i++) {
			char s = a.charAt(i);
			if ((s=='a')||(s=='e')||(s=='i')||(s=='o')||(s=='u')) {
				count++;
			}
			if (s=='a') {
				acount++;
				
			}
			if (s=='e') {
				ecount++;
			}
			if (s=='i') {
				icount++;
			}
			if (s=='o') {
				ocount++;
			}
			if (s=='u') {
				ucount++;
			}
			
	
		}
		System.out.println("Total Count : "+ count);
		System.out.println("A Count : "+ acount);
		System.out.println("E Count : "+ ecount);
		System.out.println("I Count : "+ icount);
		System.out.println("O Count : "+ ocount);
		System.out.println("U Count : "+ ucount);
		
	}
}
 