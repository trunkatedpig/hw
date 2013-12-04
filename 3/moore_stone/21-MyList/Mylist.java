import java.io.*;
import java.util.*;

public class Mylist{
    private int[] list;

    public Mylist(int[] a){
	list = a;
    }
    
    public void remove(int pos) {
// inserts data item d at location pos in the data array
// remember we have to shift down items to make room and
// we might have to grow the array
	int k = 0;
	int[] result = new int[list.length - 1];
	for (int i = 0; i < list.length; i++){
	    if (i != pos){
		result[k] = list[i];
		k = k + 1;
	    }
	}
	list = result;
    }
}
