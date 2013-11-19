import java.util.*;

public class Driver {
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4};
		
		a = myList.remove(a, 0);
		System.out.println(Arrays.toString(a));
		
		a = myList.insert(a, 1, 5);
		System.out.println(Arrays.toString(a));
		
	}
}