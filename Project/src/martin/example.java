package martin;

public class example 
{
	
	public static void pal(int a) 
	{
	
		int org=a; 
		int rev=0;
		while(a>0)
		{
			org=a%10+rev*10;
			rev=a/10;
		if( org == rev) 
		{
			System.out.print("True");
		}
		else 
		{
			System.out.print("False");
		}
		
	}
	}
		public static void main(String[] args) {
		pal(121);
}
}