package martin;


public class Encaps 
{
	
	private String name;
	
	public void set(String newname) 
	{
		name =newname;
	}
	
	public String get()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		Encaps obj=new Encaps();                                      
		obj.set("Martin");
		System.out.println("Name : "+obj.get());

	}
     
}
