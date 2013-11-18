import java.io.*;
import java.util.*;

public class myList {
    private int[] a;
    Random r = new Random();

    public myList(int length) {
        a = new int[length];
	for (int i=0;i<length;i++){
	    a[i] = r.nextInt(20);
	}
    }
    
    public String toString() {
        String s = Arrays.toString(a);
        return s;
    }

    public void insert(int pos, int d){
	int[] b = new int[a.length+1];
	for (int i=0;i<pos;i++){
	    b[i] = a[i];}
	for (int c=pos+1;c<b.length;c++){
	    b[c] = a[c-1];}
	b[pos] = d;
	a = b;
    }

    public int remove(int pos){
	int[] f = new int[a.length-1];
	for (int i=0;i<pos;i++){
	    f[i] = a[i];}
	for (int c=pos+1;c<a.length;c++){
	    f[c-1] = a[c];}
	a = f;
	return a[pos];
    }
        
}
