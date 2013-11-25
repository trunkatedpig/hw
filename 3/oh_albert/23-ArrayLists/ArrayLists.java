import java.io.*;
import java.util.*;

public class ArrayLists {
    ArrayList<Integer> a1,a2,a3,a4,a5;

    public double arrayadd(int l){
	a1 = new ArrayList<Integer>();
	double d1 = System.currentTimeMillis();
	for(int i=0;i<=l;i++){
	    a1.add(1);
	}
	double d2 = System.currentTimeMillis();
	double f1 = d2-d1;
	return f1;
    }

    public double arrayadd2(int l){
	a2 = new ArrayList<Integer>();
	double d1 = System.currentTimeMillis();
	for(int i=0;i<l;i++){
	    a2.add(0,1);
	}
	double d2 = System.currentTimeMillis();
	double f1 = d2-d1;
	return f1;
    }

    public double arrayremove(int l){
	a3 = new ArrayList<Integer>();
	for(int i=0;i<=l;i++){
	    a3.add(1);
	}
	double d1 = System.currentTimeMillis();
	for(int i=0;i<=l;i++){
	    a3.remove(0);
	}
	double d2 = System.currentTimeMillis();
	double f1 = d2-d1;
	return f1;
    }

    public double arrayremove2(int l){
	a4 = new ArrayList<Integer>();
	for(int i=0;i<=l;i++){
	    a4.add(1);
	}
	double d1 = System.currentTimeMillis();
	for(int i=1;i<l;i++){
	    a4.remove(a4.size()-(i));
	}
	double d2 = System.currentTimeMillis();
	double f1 = d2-d1;
	return f1;
    }
    //got strange errors here, I don't know why...

    public double arrayreverse(int l){
	a5 = new ArrayLists();
	for(int i=0;i<=l;i++){
	    a5.add(1);
	}
	int begin = 0,end = 0,m = a5.size()-1,mid = l/2;
	for(int i=0;i<mid;i++){
	    begin = a5.get(i);
	    end = a5.get(m);
	    a5.set(m,begin);
	    a5.set(i,end);
	    m--;
	}
    }
}
