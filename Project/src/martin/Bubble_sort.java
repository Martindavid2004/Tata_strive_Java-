package martin;

public class Bubble_sort {

	public static void main(String[] args) {
		int [] a = {1,3,7,2,9};
		int n=a.length;
		
		
	for (int i=0; i<n;i++) {
		for (int j=0; j<n-i-1;j++) {
			if (a[j] > a[j+1]) {
				int temp = a[j];
				a[j] =a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for (int num :a) {
		System.err.println(num+" ");
	}
		
	}

}