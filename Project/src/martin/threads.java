package martin;

class threads extends Thread  {
	
	public static void main(String[] args) {
		threads t = new threads();
		t.start();
		System.out.println("Thread is standing....");
		
	}
	public void run() {
		System.out.println("Thread is running...");
	}
	

}
 


