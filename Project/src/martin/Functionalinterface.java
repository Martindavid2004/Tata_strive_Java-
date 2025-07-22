package martin;
@FunctionalInterface
interface Printer{
	void print(String msg);
}

public class Functionalinterface {

	public static void main(String[] args) {
		Printer p = msg -> System.out.print(msg);
		p.print("Hello world !!");
	
	}

}
