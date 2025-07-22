package martin;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b="C:/Martin/";
		System.out.println("How many files do u want to create ?");
		int n=sc.nextInt();
		sc.nextLine();
		
		for (int i=1;i<=n;i++) {
			System.out.println("Enter Name for "+"file "+i+" :");
		
		try {
		
		String a= sc.nextLine();
		
		File obj = new File(b+a);
		
		if (obj.createNewFile()) {
			System.out.println("File Created :"+obj.getName());
		}
		else {
				System.out.println(" An Error occurred");
			}
		}
		
	
		catch(IOException e) {
			System.out.println("File is already exists");
		}
	}
	}
	
}