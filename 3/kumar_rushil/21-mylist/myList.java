import java.io.*;
import java.util.*;

public class myList{

    private int[] a;
    private Random r;
   
    public myList() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }

    public int get(int n){
	return a[n];
    }

    public String toString(){
	return Arrays.toString(a);
    }

    public int remove(int pos){
	int result = a[pos];
	int[] b = new int [a.length-1];
	for (int i = 0; i < pos; i ++){
	    b[i]=a[i];
	}
	for (int i = pos; i < b.length; i ++){
	    b[i]=a[i+1];
	}
	a = b;
	return result;
    }
}


