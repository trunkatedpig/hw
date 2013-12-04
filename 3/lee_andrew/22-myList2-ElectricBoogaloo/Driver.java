import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList ml = new myList();
	System.out.println(ml);
	ml.add(2,5);
	System.out.println(ml);
	System.out.println(5);
	ml.fremove(5);
	System.out.println(ml);
    }
}