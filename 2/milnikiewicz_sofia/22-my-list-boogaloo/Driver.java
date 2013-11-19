import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        System.out.println("\nOriginal Array:");
        System.out.println(L);
        System.out.println("\nModified Array[add]:");
        L.add(3,1337);
        System.out.println(L+"\n");
	System.out.println("\nModified Array[remove]:");
	L.remove(3);
        System.out.println(L+"\n");
	
    }


}
