import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> a;
	ArrayList<Integer> b;
	long start;
	long stop;
	int count;

        if (args.length==0) {count=100000;}
	else {count=Integer.parseInt(args[0]);}

	//add to end test
	a = new ArrayList<Integer>();
	System.out.print("add to end        x" + count + ": ");
	start = System.currentTimeMillis();
	for (int i=0; i<count; i++) {
	    a.add(0);
	}
	stop = System.currentTimeMillis();
	System.out.println(stop-start);

	//add to start test
	a = new ArrayList<Integer>();
	System.out.print("add to start      x" + count + ": ");
	start = System.currentTimeMillis();
	for (int i=0; i<count; i++) {
	    a.add(0,0);
	}
	stop = System.currentTimeMillis();
	System.out.println(stop-start);

	//remove from end
	a = new ArrayList<Integer>();
	for (int i=0; i<count; i++) {
	    a.add(0);
	}
	System.out.print("remove from end   x" + count + ": ");
	start = System.currentTimeMillis();
	for (int i=0; i<count; i++) {
	    a.remove(a.size()-1);
	}
	stop = System.currentTimeMillis();
	System.out.println(stop-start);

	//remove from start
	a = new ArrayList<Integer>();
	for (int i=0; i<count; i++) {
	    a.add(0);
	}
	System.out.print("remove from start x" + count + ": ");
	start = System.currentTimeMillis();
	for (int i=0; i<count; i++) {
	    a.remove(0);
	}
	stop = System.currentTimeMillis();
	System.out.println(stop-start);

	System.out.println();

	//reverse arraylist
	a = new ArrayList<Integer>();
	b = new ArrayList<Integer>();
	for (int i=0; i<10; i++) {
	    a.add(i);
	}
	System.out.println(a);
	for (int i=a.size()-1; i>=0; i--) {
	    b.add(a.get(i));
	}
	System.out.println(b);
    }
}




