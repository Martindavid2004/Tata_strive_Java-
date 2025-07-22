package martin;


class mobile{
	public void name() {
		System.out.println("SAMSUNG");
	}
}
class model extends mobile{
	public void name2() {
		System.out.println("APPLE");
	}
}
class os extends model{
	public void osType() {
		System.out.println("Samsung : Andriod "+" || "+" Apple : IoS");
	}
}

public class Test {
public static void main(String[] args) {
os obj = new os();
obj.name();
obj.name2();
obj.osType();
}
}