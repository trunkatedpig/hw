import java.util.*;
import java.io.*;

public class List {
    private int[] a;

    public List() {
	a=new int[5];
    }

    public int remove(int pos) {
	int result = a[pos];
	for (;pos<a.length-1;pos++)
	    a[pos]=a[pos+1];
	a[a.length]=0;
	return result;
    }
}