import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        /*
When adding and removing, we found that in both instances it was quicker working
with the items at the end than those at the beginning, by roughly a factor of 10
in ArrayLists of size 100,000
	**/
	Random r = new Random();
	ArrayList<Integer> ints = new ArrayList<Integer>(20);
	ArrayList<Double> doubles = new ArrayList<Double>(5);
	for (int i = 0; i < 20; i++){
	    ints.add(r.nextInt(20));
	}
	for (int i = 0; i < 5; i++){
	    doubles.add(r.nextDouble());
	}
	ArrayList<Integer> intFlip = new ArrayList<Integer>(ints.size());
	for (int i = ints.size()-1; i >= 0; i--){
	    intFlip.add(ints.get(i));
	}
	ArrayList<Double> dFlip = new ArrayList<Double>(doubles.size());
	for (int i = doubles.size()-1; i >= 0; i--){
	    dFlip.add(doubles.get(i));
	}
	System.out.println(ints);
	ints = intFlip;
	System.out.println(ints);

	System.out.println(doubles);
	doubles = dFlip;
	System.out.println(doubles);
    }
}
