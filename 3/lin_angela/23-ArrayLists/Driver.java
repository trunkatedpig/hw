import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	ArrayListStuff x = new ArrayListStuff();
	long start, t, start1, start2, time, time1;
	//times in milliseconds: addv1, addv2
	//at 1000: 1, 0 
	//at 10,000: 5, 2
	//at 100,000: 14, 8
	//at 1,000,000: 34, 63
	//the first version of adding (with specified index) is faster...
	start = System.currentTimeMillis();
	x.addv1(1000000); 
	t = System.currentTimeMillis() - start;
	System.out.println("first version of add:" + t);
	start = System.currentTimeMillis();
	x.addv2(1000000); 
	t = System.currentTimeMillis() - start;
	System.out.println("second version of add:" + t);
	///////////////
	///////////////
	///////////////
	//times in milliseconds: removeFront, removeBack
	//at 100: 0,0
	//at 1000: 1,1
	//at 10,000:37,1
	//at 100,000:3160,4
	//removing from the back is much faster than removing from the front...
	ArrayListStuff y = new ArrayListStuff();
	y.addv1(100000);
	start1 = System.currentTimeMillis();
	y.removeFront();
	time = System.currentTimeMillis() - start1;
	System.out.println("removing from front:" + time);

	ArrayListStuff w = new ArrayListStuff();
	w.addv1(100000);
	start2 = System.currentTimeMillis();
	w.removeBack();
	time1 = System.currentTimeMillis() - start2;
	System.out.println("removing from back:" + time1);

	//////////Reversal
	//////////

	//setup:
	ArrayList<Integer> r = new ArrayList<Integer>();
	int input = 0;
	while (input <= 100){
	    r.add(input);
	    input++;
	}
	System.out.println(r.toString());

	//reversal:
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = 0; i<r.size(); i++){
	    temp.add(i, r.get((r.size()-1)-i));
	    }
	r = temp;

	System.out.println(r.toString());//reversed version
    }
}
