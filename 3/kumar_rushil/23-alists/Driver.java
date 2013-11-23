import java.util.*;
import java.io.*;
public class Driver {
    public static void main(String[] args){

	ArrayList<Integer> ilist = new ArrayList<Integer>();
	ArrayList<Integer> ilist2 = new ArrayList<Integer>();
	long l = System.currentTimeMillis();
	System.out.println(l);
	for (int i = 0; i < 100; i++){
	    ilist.add(13);
	}
	l = System.currentTimeMillis();
	System.out.println(l);
	for(int i = 0; i< 100;i++){
	    ilist2.add(i,13);
	}
        l = System.currentTimeMillis();
	System.out.println(l);
    }
}