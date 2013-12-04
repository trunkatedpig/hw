import java.io.*;
import java.util.*;

public class MyStringList {
    private String[] data;
    private int items = 0;

    public MyStringList(int n) {
	data = new String[n];
    }

    public boolean isFull() {
	return items >= data.length;
    }

    public void grow() {
        String[] temp = new String[(int)(data.length * 1.5)];
	for (int i = 0;i < data.length;i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public String toString() {
	return Arrays.toString(data);
    }

    public void add(String n) {
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

    public void add(int pos,String n) {
	if (pos > data.length)
	    pos = items;
	grow();
	for (int i = items;i > pos;i--) {
	    data[i] = data[i - 1];
	}
	data[pos] = n;
	items = items + 1;
    }

    public String get(int pos) {
	return data[pos];
    }

    public void set(int pos,String d) {
	data[pos] = d;
    }

    public String size() {
	return Integer.toString(items);
    }

    public String find(String n) {
	for (int i = 0;i < items;i++) {
	    if (data[i].equals(n)) 
		return data[i];
	}
	return "0";
    }

    public void fremove(String n) {
	for (int i = 0;i < items;i++) {
	    if (data[i].equals(n)) {
		remove(i);
		break;
	    }
	}
    }

    public String[] data() {
	return data;
    }
}

