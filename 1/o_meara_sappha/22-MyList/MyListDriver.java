import java.io.*;
import java.util.*;

public class MyListDriver {
    public static void main(String[] args) {
	MyList L = new MyList();

	for (int i = 1; i < 16; i ++) {
            L.add(i);
        }
	System.out.println(L);
	
	L.add(3, 3);
	System.out.println(L);
	
	L.remove(2);
	System.out.println(L);
	
	L.remove(32);
	System.out.println(L);
	
	System.out.println(L.size());
	
	System.out.println(L.get(4));
	
	L.set(4, 6);
	System.out.println(L);
	
	System.out.println(L.find(10));
        System.out.println(L.find(52));
	
        L.fremove(10);
        System.out.println(L);
	
        L.fremove(52);
        System.out.println(L);

    }
}
