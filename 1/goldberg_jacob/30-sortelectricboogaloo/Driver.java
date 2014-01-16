import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){
	Insertion g = new Insertion(40000);
	System.out.println("Insertion Sort");
	long start, end;
        //g.getArray();
	start = System.currentTimeMillis();
	g.sort();
	end = System.currentTimeMillis();
        g.getArray();
	System.out.println("Comparisons : " + g.getComps());
	System.out.println("Swaps : " + g.getSwaps());
	System.out.println("Time : " + (end - start));

	Selection s = new Selection(40000);
	System.out.println("Selection Sort");
	//s.getArray();
	start = System.currentTimeMillis();
	s.sort();
	end = System.currentTimeMillis();
	s.getArray();
	System.out.println("Comparisons : " + s.getComps());
	System.out.println("Swaps : " + g.getSwaps());
	System.out.println("Time : " + (end - start));
    }

}
