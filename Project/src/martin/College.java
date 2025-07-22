package martin;

interface A{
	public void principal();
}
interface B{
	public void Hod();
}
class name implements A,B{
	public void principal() {
		System.out.println("Dr.P.Alavanthan");
	}
	public void Hod() {
		System.out.println("Dr.Aishwarya");
	}
	
}

class College {
public static void main(String[] args) {
	name obj = new name();
	obj.principal();
	obj.Hod();
}
}
