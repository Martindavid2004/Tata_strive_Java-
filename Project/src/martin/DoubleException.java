package martin;

public class DoubleException {
	public int[] arr = new int[10];
	public void writeFile() {
		try {
			int a=69/0;
			}
		catch(ArithmeticException e3) {
			System.out.println("ArithmeticException =>"+e3.getMessage());
		}
		try {
			arr[10]=11;
			
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println("IndexOutOfBoundException =>"+e2.getMessage());
		}
		
	}
	

	public static void main(String[] args) {
		DoubleException obj=new DoubleException();
		obj.writeFile();

	}

}
