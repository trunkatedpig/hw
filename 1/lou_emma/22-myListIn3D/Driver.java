import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
       /* 
	    myList L = new myList();
        for (int i = 0; i <= 10; i++){
            L.add(i*2);
        }
        System.out.println(L);
        L.fremove(4);

        System.out.println(L);
        System.out.println(L.indexOf(100));
		
		*/
		//TEST FOR STRING LIST
		
		myStringList L2 = new myStringList();
		for (int i = 0; i<12; i++){
			L2.add("Hello"+i);
		}
		System.out.println(L2);
		System.out.println("-----------------");
		
		L2.fremove("Hello3");
		System.out.println(L2);
		System.out.println("-----------------");
		
		L2.add(5, "HEYAAA");
		System.out.println(L2);
		

    }
}