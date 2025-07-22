package martin;


interface Animal {
	public void dog();
}
interface Ball {
	public void bark();
}
class Cat implements Animal,Ball{
	public void dog() {
		System.out.println("BARK..");
	}
	public void bark() {
		System.out.println("MEOOW..");
	}
}

public class Interface2{
	public static void main(String[] args) { 
		Cat obj = new Cat();
		obj.dog();
		obj.bark();
	}
}