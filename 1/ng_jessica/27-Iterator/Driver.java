import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
	myList ml = new myList();
        	ml.add(10);
        	ml.add(20);
       		ml.add(60);
       		ml.add(40);
        	ml.add(100);
        	System.out.println(ml);
        	Iterator<Integer> mlit = ml.iterator();
        	while (mlit.hasNext()) {
           		System.out.println(mlit.next());
        }
    }
}
