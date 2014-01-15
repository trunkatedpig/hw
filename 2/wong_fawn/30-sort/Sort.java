import java.io.*;
import java.util.*;

public class Sort {
    int[] a = new int[200000];
    int len = a.length;
    Random r = new Random();

    public Sort() {
	for (int i = 0; i < len; i++) {
	    a[i] = r.nextInt(1000);
	}
    }

    public void selectSort() {
	int tempmin = a[0];
	for (int i = 1; i < len; i++) {
	    for (int x = i +
	}
    }
}