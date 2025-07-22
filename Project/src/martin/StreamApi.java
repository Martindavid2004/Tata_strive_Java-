package martin;
import java.util.*;
public class StreamApi {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,8);
		int sum = num.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum);

	}

}
