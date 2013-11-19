import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList ml = new myList();
	System.out.println(ml);
	ml.add(2,5);
	System.out.println(ml);
	ml.remove(2);
	System.out.println(ml);
	System.out.println(ml.size());
	System.out.println(ml.get(2));
	ml.set(2,5);
	System.out.println(ml);
    }
}