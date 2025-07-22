package martin;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter my = new FileWriter("C://Martin/martin.txt");
			my.write("hello");
			my.close();
			System.out.println("Success");
		}catch(IOException e) {
			System.out.println("An error");
		}
		

	}

}
