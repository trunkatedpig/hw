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

        stringList S = new stringList();
	System.out.println(S);
	for(int i = 0; i < 5; i++){
	    S.add(String.valueOf((i+1)*5));
	}
  	System.out.println(S);
	S.add(3, "apples");
	System.out.println(S);
	S.remove(4);
	System.out.println(S);
	System.out.println(S.find("apples"));
	S.fremove("apples");
	System.out.println(S);

    }
}
