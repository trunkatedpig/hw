import java.io.*;
import java.util.*;

public class MyList {
    private int[] a;
    private Random r;
    
    public MyList() {
        r = new Random();
        a = new int[20];
        for (int i=0;i<a.length;i++)
            a[i]=r.nextInt(100);
    }

    public int get(int n) {
        return a[n];
    }

      public String toString() {
        return Arrays.toString(a);
    }

    public int remove(int pos) {
	int answer = a[pos];
	for (int i = pos; i < a.length-1; i++) {
	    a[i] = a[i+1];
	}
	int[] temp = new int[a.length-1];
	for (int i = 0; i < temp.length; i++) {
	    temp[i] = a[i];
	}
	a = temp;
	return answer;
    }
}
