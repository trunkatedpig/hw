import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList L = new myList(5);

        System.out.println(L);
	System.out.println();

        for (int i=0;i<5;i++)
            L.add((i+1)*10);
        System.out.println(L);
	System.out.println();

        for (int i=0;i<7;i++)
            L.add((i+1)*10);
        System.out.println(L);
	System.out.println();

	L.add(6,100);
	System.out.println(L);
	System.out.println();

	L.add(20,100);
	System.out.println(L);
	System.out.println();

	L.remove(10);
	System.out.println(L);
	System.out.println();

	System.out.println(L.size());
	System.out.println();

	System.out.println(L.get(20));
	System.out.println();

	L.set(16,100);
	System.out.println(L);
	System.out.println();

	System.out.println(L.find(40));
	System.out.println(L);
	System.out.println();

	System.out.println(L.fremove(60));
	System.out.println(L);
	System.out.println();
    }


}
