import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);

        for (int i = 0; i < 5; i++) {
            L.add((i + 1) * 10);
        }
        System.out.println(L);

        for (int i = 0; i < 7; i++) {
            L.add((i + 1) * 10);
        }
        System.out.println(L);

        System.out.println("Add");
        L.add(2, 4);
        System.out.println(L);
	System.out.println("Remove");
	L.remove(2);
	System.out.println(L);
	L.size();
	L.get(2);
	L.set(2, 100);
	System.out.println(L);
	

    }        


}