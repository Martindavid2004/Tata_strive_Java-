package martin;
import java.util.*;
import java.io.*;

public class throws1 {
	static void checkFile() throws IOException{
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
		try {
			checkFile();
}catch(IOException e) {
	System.out.println("Caught an excxeption : "+ e.getMessage());
}

}
}