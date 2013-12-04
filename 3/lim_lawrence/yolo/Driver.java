import java.util.*;

public class Driver {
    public static ArrayList<Integer> sort(ArrayList<Integer> a, int place) {
	if(a.size()<=1){return a;}

	ArrayList<ArrayList<Integer>> buckets = 
	    new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> r = new ArrayList<Integer>();
	
	for (int i=0; i<10; i++)
	    buckets.add(new ArrayList<Integer>());
	for (int i=0; i<a.size(); i++)
	    buckets.get(a.get(i)/(int)Math.pow(10,place-1)%10).add(a.get(i));
	for (int i=0; i<buckets.size(); i++)
	    r.addAll(sort(buckets.get(i),place-1));
	
	return r;
    }

    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random rng = new Random();

	for(int i=0; i<10; i++)
	    a.add(rng.nextInt(10000));
	
	System.out.println(a);
	System.out.println(sort(a,4));
    }
}
