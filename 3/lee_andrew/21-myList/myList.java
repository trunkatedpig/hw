import java.io.*;
import java.util.*;

public class myList {
    private int[] a;
    private Random r;

    public myList() {
	r = new Random();
	a = new int[5];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int[] remove(int pos) {
	int tempi = 0;
	int[] temp = new int[a.length-1];
	for (int i=0;i<a.length;i++){
	    if (i == pos)
		i = i + 1;
	    temp[tempi] = a[i];
	    tempi = tempi + 1;
	}
	a = temp;
	return a;
    }
}