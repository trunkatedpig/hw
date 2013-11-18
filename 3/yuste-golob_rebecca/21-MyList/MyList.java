import java.io.*;
import java.util.*;

public class MyList {
    private int[] a;
    private Random r;

    public MyList(){
	r = new Random();
	a = new int[20];
	for (int i = 0; i < a.length; i =i +1){
	    a[i] = r.nextInt(100);
	}
    }

    public MyList(int l){
	r = new Random();
	a = new int[l];
	for (int i = 0; i < a.length; i = i + 1){
	    a[i] = r.nextInt(100);
	}
    }

    public String toString(){
	return Arrays.toString(a);
    }

    public void insert(int pos, int d){
	int[] result = new int[a.length + 1];
	for (int i = 0; i < pos; i = i +1){
	    result[i] = a[i];
	}
	for (int j = pos; j < result.length; j = j +1){
	    if (j == pos){
		result[j] = d;
	    } else {
		result[j] = a[j -1];
	    }
	}
	a = result;
    }

    public void remove(int pos){
	int[] result = new int[a.length-1];
	for (int i = 0; i < pos; i = i +1){
	    result[i] = a[i];
	}
	for (int j = pos; j <result.length; j = j +1){
	    result[j] = a[j+1];
	}
	a = result;
	
    }
}
