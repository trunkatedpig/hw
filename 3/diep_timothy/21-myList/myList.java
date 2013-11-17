import java.io.*;
import java.util.*;

public class myList {
    int[] data;
    Random r = new Random();

    public myList(int length, int max) {
	data = new int[length];
	for (int i=0;i<length;i++) {
	    data[i] = r.nextInt(max);
	}	    
    }

    public String toString() {
	return Arrays.toString(data);
    }

    public void insert(int pos, int d) {
	int[] temp = new int[data.length+1];
	for (int n=0;n<pos;n++) {
	    temp[n] = data[n];
	}
	for (int i=pos;i<temp.length;i++) {
	    if (i==pos)
		temp[i] = d;
	    else
		temp[i] = data[i-1];
	}
	data = temp;
	System.out.println("Inserted " + d + " into position " + pos + "!");
    }
    
    public void remove(int pos) {
	int[] temp = new int[data.length-1];
	int out = 0;
	int outpos = pos;
	for (int n=0;n<pos;n++) {
	    temp[n] = data[n];
	}
	for (int i=pos;i<data.length;i++) {
	    if (i==pos) {
		out = data[i];
		pos = -1;
	    } else
		temp[i-1] = data[i];
	}
	data = temp;
	System.out.println("Removed " + out + " from position " + outpos + "!");
    }
}
	
