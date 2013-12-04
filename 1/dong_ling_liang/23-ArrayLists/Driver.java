import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> test = new ArrayList<Integer>();
	int howlong = 100000;

	//part 1: adding to beginning is much slower, though not so bad <10k
	long tiem = System.currentTimeMillis();
	for (int i=0; i<howlong; i++){
	    test.add(1);
	}
	System.out.println("ADD TIME:" + ( System.currentTimeMillis() - tiem));
	test.clear();
	tiem = System.currentTimeMillis();
	for (int i=0; i<howlong; i++){
	    test.add(0, 1);
	}
	System.out.println("ADDtoStart TIME:"+(System.currentTimeMillis()-tiem));
	test.clear();
	
	//PART 2: removing from the back is faster, but only by a little
	for (int i=0; i<howlong; i++){
	    test.add(1);
	}
	ArrayList<Integer> test1 = new ArrayList<Integer>(test);
	ArrayList<Integer> test2 = new ArrayList<Integer>(test);
	tiem=System.currentTimeMillis();
	for (int i=0; i<test1.size(); i++){
	    test1.remove(0);
	}
	System.out.println("REMOVEfront:"+ (System.currentTimeMillis()-tiem));
	tiem = System.currentTimeMillis();
	for (int i=0; i<test2.size(); i++){
	    test2.remove(i);
	}
	System.out.println("REMOVEback:"+(System.currentTimeMillis()- tiem));
	
	test.clear();
	for (int i=0; i<20; i++){
	    test.add(i);
	}
	Arraylists atest = new Arraylists();
        System.out.println(atest.reverseList(test));

    }

}