import java.util.*;
import java.io.*;
public class Driver {
    public static void main(String[] args){
	long start, t;

	/*
	start = System.currentTimeMillis();
	ArrayList<Integer> ilist = new ArrayList<Integer>();
	ArrayList<Integer> ilist2 = new ArrayList<Integer>();
	t = System.currentTimeMillis()-start;
	System.out.println(t);

	//This method is faster and the larger the list, 
	//the faster it is over the other method.
	start = System.currentTimeMillis();
	for (int i = 0; i < 100000000; i++){
	    ilist.add(13);
	}
	t = System.currentTimeMillis()-start;
	System.out.println(t);


	//This gets very slow as the list gets large.
	start = System.currentTimeMillis();
	for(int i = 0; i< 100000000;i++){
	    ilist2.add(i,13);
	}
        t = System.currentTimeMillis()-start;
	System.out.println(t);

	//Both removes take about the same time to run.
	//However, they take much more time than the add methods.
	start = System.currentTimeMillis();
	for (int i = 0; i < 100; i++){
	    ilist.remove(13);
	}
	t = System.currentTimeMillis()-start;
	System.out.println(t);

	start = System.currentTimeMillis();
	for(int i = 0; i< 100;i++){
	    ilist2.remove(i);
	}
        t = System.currentTimeMillis()-start;
	System.out.println(t);
	*/

	ArrayList<Integer> ilist3 = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++){
	    int k = r.nextInt(21);
	    ilist3.add(k);
	}
	//Reversing the list
	int begin = 0;
	int end = 0;
	int k = ilist3.size()-1;
	for (int i = 0; i < 10; i++){
	    begin = ilist3.get(i);
	    end = ilist3.get(k);
	    ilist3.set(k,begin);
	    ilist3.set(i,end);
	    k--;
	}
    }
}
