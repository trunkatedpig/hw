import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	System.out.println(L);
	for(int i = 0; i < 5; i++){
	    L.add((i+1)*5);
	}
  	System.out.println(L);
	L.add(3, 999);
	System.out.println(L);
	L.remove(3);
	System.out.println(L);

    }
}
