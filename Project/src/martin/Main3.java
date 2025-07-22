package martin;

class AA extends Thread {
	public void run(){
	for(int i=1;i<=5;i++) {
		System.out.println("From thread i : "+ i);
	}
	System.out.println("Thread A is Exited");
}
}

class BB extends Thread {
	public void run() { 
	for(int j=1;j<=5;j++) {
		System.out.println("From thread j : "+ j);
	}
	System.out.println("Thread B is Exited");
}
}

class CC extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
	
		System.out.println("From thread j : "+ i);
	}
	System.out.println("Thread C is Exited");
}
}
public class Main3 {

	public static void main(String[] args) {
		AA obj1=new AA();
		BB obj2=new BB();
		CC obj3=new CC();
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}

