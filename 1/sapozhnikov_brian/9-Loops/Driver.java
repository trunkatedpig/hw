import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops L = new Loops();
	System.out.println(L.fact(5));
	System.out.println(L.fact2(4));
	System.out.println(L.GCD(8,12));
	System.out.println(L.GCD2(40,100));
	System.out.println(L.GCD(452930477,472882027));
        System.out.println(L.GCD2(452930477,472882027));
	System.out.println(L.isPrime(1));
	System.out.println(L.isPrime(24));
	System.out.println(L.isPrime(29));

	//tests
	/*doesn't work
	for (int i = 0;i<10;i++){

	}
	System.out.println(i);
	*/
	/*doesn't: i is already defined
	  L.test();
	*/
	System.out.println(L.backwards("Hello"));
    }
}
