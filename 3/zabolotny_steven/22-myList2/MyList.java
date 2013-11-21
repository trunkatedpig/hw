import java.io.*;
import java.util.*;

public class MyList {
    private int[] data;
    private int items = 0;

    public MyList(int n) {
	data = new int[n];
    }

    public boolean isFull() {
	return items >= data.length;
    }

    public void grow() {
        int[] temp = new int[(int)(data.length * 1.5)];
	for (int i = 0;i < data.length;i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public String toString() {
	return Arrays.toString(data);
    }

    public void add(int n) {
	if (items == data.length) {
	    grow();
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

    public void add(int pos,int n) {
	if (pos > data.length)
	    pos = items;
	grow();
	for (int i = items;i > pos;i--) {
	    data[i] = data[i - 1];
	}
	data[pos] = n;
	items = items + 1;
    }

    public int get(int pos) {
	return data[pos];
    }

    public void set(int pos,int d) {
	data[pos] = d;
    }

    public int size() {
	return items;
    }

    public int find(int n) {
	for (int i = 0;i < items;i++) {
	    if (data[i] == n) 
		return data[i];
	}
	return 0;
    }

    public void fremove(int n) {
	for (int i = 0;i < items;i++) {
	    if (data[i] == n) {
		remove(i);
		break;
	    }
	}
    }

    public int[] data() {
	return data;
    }

    public String[] rewrite(MyList m) {
	String[] retArray = new String[m.size()];
	for (int i = 0;i < m.size();i++) {
	    retArray[i] = Integer.toString(m.data()[i]);
	}
	return retArray;
    }
}

