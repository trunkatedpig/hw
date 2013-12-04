import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	myList L = new myList();

	System.out.println(L);
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);

	for (int i = 0; i<10; i++){
	    L.add((i+1)*5);
	}
	System.out.println(L);

	L.insert(4,36);
	System.out.println(L);
	L.insert(16,12);
	System.out.print(L);
    }
}
