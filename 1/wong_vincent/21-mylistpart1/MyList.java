import java.util.*;
import java.io.*;

public class MyList {
    private int[] array= {1,2,3,4,5,6,7,8,9,10};
    public String s = "0";

    public String insert (int pos, int d) {
	int [] newArray = new int [array.length + 1];
	//public String s;
	
	for (int i = 0; i < pos; i++) {
	    newArray [i] = array [i];
	}

	if (1 == 1) {
	    newArray [pos] = d;
	}

	for (int z = pos + 1; z < newArray.length; z++) {
	    newArray [z] = array [z-1];
	}
	
	for (int i = 0; i < newArray.length; i++) {
	    s = s + ", " + newArray[i];
	}
	return s;
    }

    public String remove (int i) {
	
    }

    public String get (int i) {
	return array[i];
    }

    public String set (int i, int d) {
	array [i] = d;
    }
}

