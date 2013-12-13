import java.util.*;


public class Driver {
    public static void main(String[] args) {
	/*char[] a = {'a', 'e', 'b', 'd'};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.binarySearch(a, '-'));*/
	WordSearch w = new WordSearch();
	w.addWordH(3, 3, "fish", 1);
	w.addWordH(4, 5, "fish", -1);
	w.addWordV(8, 3, "corn", 1);
	w.addWordV(9, 15, "corn", -1);
	w.addWordD(14, 11, "apple", 1, 1);
	w.addWordD(12, 11, "pears", -1, 1);
	w.addWordD(14, 9, "cherry", 1, -1);
	w.addWordD(12, 9, "banana", -1, -1);
	System.out.println(w);
    }

}
