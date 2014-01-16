import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {

	Sort s = new Sort();

	int [] d = {1,9,2,8,3,7,4,6,5};

	System.out.println(Arrays.toString(d));

	//s.bubblesort(d);
	s.selectionsort(d);

	System.out.println(Arrays.toString(d));
    }
}
