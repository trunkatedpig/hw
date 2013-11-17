import java.util.*;

public class Driver {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		a = myList.remove(a, 4);
		System.out.println(Arrays.toString(a));
		
		a = myList.insert(a, 4, 5);
		System.out.println(Arrays.toString(a));
		
	}
}