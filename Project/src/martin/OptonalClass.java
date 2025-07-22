package martin;
import java.util.Optional;

public class OptonalClass {

	public static void main(String[] args) {
		Optional <String> name= Optional.ofNullable(" No Name ");
		System.out.println(name);
	}

}
