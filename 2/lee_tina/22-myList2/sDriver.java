import java.io.*;
import java.util.*;

public class sDriver{
    public static void main (String[] args){
	stringList L = new stringList();
	
	System.out.println(L);
	for (int i = 0; i < 5; i++){
	    L.add("a" + i);
	}
	System.out.println(L);
	L.add(3,"b");
	System.out.println(L);
	System.out.println("-------------------------------");
	System.out.println(L);
	L.remove(4);
	System.out.println(L);
	System.out.println("-------------------------------");
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(4));
	System.out.println(L.get(14));
	System.out.println("-------------------------------");
	System.out.println(L);
	System.out.println(L.set(2,"c"));
	System.out.println(L);
	System.out.println("-------------------------------");
	System.out.println(L);
	System.out.println(L.find("d"));
	System.out.println(L.find("c"));
	System.out.println("-------------------------------");
	System.out.println(L);
	L.fremove("e");
	System.out.println(L);
	L.fremove("b");
	System.out.println(L);
    }
}
