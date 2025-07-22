package martin;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println();
		char a = sc.next().charAt(0); 
		
		
		
		switch(a) 
		{
		
		case 'A':
			System.out.println("Grade:A // 80 to 90 marks");
			break;
		
		case 'B':
			System.out.println("Grade:B // 60 to 80 marks");
			break;
			
		case 'C':
			System.out.println("Grade:C // 40 to 60 marks");
			break;
		
		default:
			System.out.println("Fail");
			break;
			
		}
	}

}
