import java.util.*;
public class Driver{
    public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	long start = System.currentTimeMillis();
	for (int i = 0; i < 100; i++)
	    a1.add(i);
	long t = System.currentTimeMillis() - start;
	System.out.println("add at the end " + t);
	start =  System.currentTimeMillis();
	for (int i = 0; i < 100; i++) // starts to become slower at 10,000 - the difference became very large at 100,000
	    a2.add(0,i);
	t = System.currentTimeMillis() - start;
	System.out.println("add at the beginning " + t);	
	start = System.currentTimeMillis();
	for (int i = a1.size() - 1; 0 < i; i--)
	    a1.remove(i);
        t = System.currentTimeMillis() - start;
	System.out.println("remove at the end " + t);
	start =  System.currentTimeMillis();
	for (int i = 0; i < 100; i++) // starts to become slower at 10,000 - the difference became very large at 100,000
	    a2.remove(0);
	t = System.currentTimeMillis() - start;
	System.out.println("remove at the beginning " + t);
	ArrayList<Integer> a3 = new ArrayList<Integer>();
	for (int i = 0; i < 100; i++)
	    a1.add(i);
	System.out.println(a1);
	int size = a1.size() - 1;
	for (int i = size; 0 <= i; i--){
	    a3.add(a1.get(i));
	}
	a1 = a3;
	System.out.println(a1);
	
 }
}
	
