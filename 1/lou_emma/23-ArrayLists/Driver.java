import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
       /* ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 1; i < 10000001; i++){
            A.add(4 * i);
        }
        long start = System.currentTimeMillis();
        A.remove(0);
        long t = System.currentTimeMillis()-start;
        System.out.println(t);
        //end - remove and add - nothing ms
        //start - remove and add - 22/23 ms
        for (int i = 0; i < A.size(); i++){
            
        }*/
		
		//PART 3:reverse an array list
		ArrayList <Integer> B = new ArrayList<Integer>();
		for (int i=0; i<11; i++){
			B.add(1*i);
		}
		System.out.println("this is B before:" + B);
		//Array List B right now is [0,1,2,3,4,5,6,7,8,9]
		int back=B.size()-1;
		for (int i=0; i<B.size()/2; i++){
			int number=B.get(back);
			B.set(back, B.get(i));
			B.set(i, number);
			back=back-1;
		}
		System.out.println("this is B after:" + B);
    }
}