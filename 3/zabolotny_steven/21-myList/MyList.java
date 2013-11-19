import java.io.*;
import java.util.*;

public class MyList {
    private int[] data;
    private int items = 0;

    public MyList(int n) {
	data = new int[n];
    }

    public String toString() {
	return Arrays.toString(data);
    }

    public void add(int n) {
	if (items == data.length) {
	    int[] temp = new int[(int)(data.length * 1.5)];
	    for (int i = 0;i < data.length;i++) {
		temp[i] = data[i];
	    }
	    data = temp;
	}
	data[items] = n;
	items = items + 1;
    }

    public void remove(int pos) {
	for (int i = pos;i < data.length - 1;i++) {
	    data[i] = data[i + 1];
	}
	items = items - 1;
    }

    public void insert(int pos,int n) {
	add(0);
	for (int i = items;i > pos;i--) {
	    data[i] = data[i - 1];
	}
	data[pos] = n;
	items = items + 1;
    }
}