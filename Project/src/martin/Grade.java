package martin;

abstract class Vehicale{
abstract void sound();
public void car() {
	System.out.println("Swift");
}
}
class Bike extends Vehicale{
	public void sound() {
		System.out.println("tu..tu..tu..tu");
	
	}
	
	}

public class Grade{
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.car();
		obj.sound();
	}
}