import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	myList L = new myList();
	L.add(0);
	L.add(1);
	L.add(2);
	L.add(4);
	System.out.println(L);
	L.insert(3, 3);
	System.out.println(L);
    }
}
