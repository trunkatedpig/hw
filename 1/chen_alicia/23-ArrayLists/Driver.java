import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        ArrayList<Integer> test = new ArrayList<Integer>();
        int howlong = 100000;

	//part 1: adding to beginning is much slower than adding to end. didn't have the patience to wait for anything > 10k
        long time = System.currentTimeMillis();
        for (int i=0; i<howlong; i++){
            test.add(1);
        }
        System.out.println("Time to add at end: " + ( System.currentTimeMillis() - time));
        test.clear();
        time = System.currentTimeMillis();
        for (int i=0; i<howlong; i++){
            test.add(0, 1);
        }
        System.out.println("Time to add at beginning: "+(System.currentTimeMillis()-time));
        test.clear();

	//part 2: takes longer to remove front the front than from the end
        for (int i=0; i<howlong; i++){
            test.add(1);
        }
        ArrayList<Integer> test1 = new ArrayList<Integer>(test);
        ArrayList<Integer> test2 = new ArrayList<Integer>(test);

        time=System.currentTimeMillis();
        for (int i=0; i<test1.size(); i++){
            test1.remove(0);
        }
        System.out.println("Time to remove from front: "+ (System.currentTimeMillis()-time));

        time = System.currentTimeMillis();
        for (int i=0; i<test2.size(); i++){
            test2.remove(i);
        }
        System.out.println("Time to remove from back: "+(System.currentTimeMillis()- time));
        
        test.clear();
	
	//part 3: reverseList
	for (int i = 0; i < 100; i++){
	    test.add(i);
        }
        System.out.println("Original:" + test);

        for (int i = 0; i < test.size()/2; i++){
            int l= test.get(i);
            int r=test.get(test.size()-1-i);
            test.set(i,r);
            test.set(test.size()-1-i,l);
        }
	System.out.println("Reversed:" + test);
    }
}
