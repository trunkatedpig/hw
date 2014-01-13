import java.util.*;

public class Driver {
    public static ArrayList<Integer> radixsort(ArrayList<Integer> a, int place) {
	if(a.size()<=1){return a;}

	ArrayList<ArrayList<Integer>> buckets = 
	    new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> r = new ArrayList<Integer>();
	
	for (int i=0; i<10; i++)
	    buckets.add(new ArrayList<Integer>());
	for (int i=0; i<a.size(); i++)
	    buckets.get(a.get(i)/(int)Math.pow(10,place-1)%10).add(a.get(i));
	for (int i=0; i<buckets.size(); i++)
	    r.addAll(radixsort(buckets.get(i),place-1));
	
	return r;
    }

    public static ArrayList<Integer> bubblesort(ArrayList<Integer> a) {
	ArrayList<Integer> r = a;
	int n;
	
	for (int i=0; i<r.size(); i++) {
	    for (int j=0; j<r.size()-1; j++) {
		if(r.get(j)>r.get(j+1)) {
		    n = r.get(j);
		    r.set(j,r.get(j+1));
		    r.set(j+1,n);
		}
	    }
	}
	
	return r;
    }

    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random rng = new Random();

	for(int i=0; i<10; i++)
	    a.add(rng.nextInt(10000));

	System.out.println(a);
	System.out.println(radixsort(a,4));
	
	a = new ArrayList<Integer>();
	a.add(3);
	a.add(4);
	a.add(1);
	a.add(8);
	a.add(9);
	a.add(9);
	a.add(0);
	a.add(6);
	a.add(7);
	
	System.out.println(bubblesort(a));
    }
}
