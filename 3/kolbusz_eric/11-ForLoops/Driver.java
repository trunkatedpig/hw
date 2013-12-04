import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	For f;
	f = new For();

	System.out.println(f.isPrimeF(47)); //True
	System.out.println(f.isPrimeF(2)); //True
	System.out.println(f.isPrimeF(12)); //False
      
      	System.out.println(f.Reverse("hello")); //olleh
	System.out.println(f.Reverse("7$. ~|")); //|~ .$7
	
	System.out.println(f.table(1,1));
        System.out.println(f.table(1,10));
	System.out.println(f.table(10,1));
	System.out.println(f.table(6,6));
	System.out.println(f.table(2,4));
    }
}
