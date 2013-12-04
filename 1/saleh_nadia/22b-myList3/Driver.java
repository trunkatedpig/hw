import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	myStringList L = new myStringList();
	System.out.println(L);
	L.add("a");
	L.add("b");
	L.add("d");
	L.add("e");
	L.add("f");
	L.add("g");
	System.out.println(L);
	L.add(2,"c");
	System.out.println(L);
	L.remove(4);
	System.out.println(L);
	L.set(5,"abcdefg");
	System.out.println(L);
	L.fremove("abcdefg");
	System.out.println(L);
    }
}
