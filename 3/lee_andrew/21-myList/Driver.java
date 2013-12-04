import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList ml = new myList();
	System.out.println(ml);
	System.out.println(Arrays.toString(ml.remove(2)));
    }
}