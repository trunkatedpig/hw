import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayLists b1,b2,b3,b4,b5,b6,b7;
	//For arrayadd(int l) using a.add(1):
	//100 items took 0.0 millis
	//1000 items took 1.0 millis
	//10000 items took 4.0 millis
	//100000 items took 20.0 millis
	//1000000 items took 26.0 millis
	//10000000 items took 289.0 millis
	//100000000 items got a java.lang.OutOfMemoryError

	//For arrayadd2(int l) using a.add(0,1)
	//100 items took 0.0 millis
	//1000 items took 1.0 millis
	//10000 items took 17.0 millis
	//100000 items took 909.0 millis
	//1000000 items took 117257.0 millis
	//10000000 items took an indefinite amount of time

	//Conclusion: a.add("x") is better

	//For arrayremove(int l) using a.remove(0)
	//100 items took 0.0 millis
	//1000 items took 0.0 millis
	//10000 items took 15.0 millis
	//100000 items took 965.0 millis
	//1000000 items took 127807.0 millis
	//10000000 items took an indefinite amount of time

	b1 = new ArrayLists();
	System.out.println(b1.arrayremove2(100));

	b2 = new ArrayLists();
	System.out.println(b1.arrayremove2(1000));

	b3 = new ArrayLists();
	System.out.println(b1.arrayremove2(10000));

	b4 = new ArrayLists();
	System.out.println(b1.arrayremove2(100000));

    }
}
