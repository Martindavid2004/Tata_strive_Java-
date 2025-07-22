package martin;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File obj = new File("C://Martin/martin.txt");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()) {
				String data = sc.next();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
		

	}

}
