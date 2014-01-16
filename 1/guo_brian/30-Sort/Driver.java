import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args) {
	Sort j = new Sort(90);
	int[]Test2 = j.getTest2();
	long start = System.currentTimeMillis();
	j.sort();
	long checkpoint1 = System.currentTimeMillis();
	System.out.println(checkpoint1 - start);
	long checkpoint2 = System.currentTimeMillis();
	j.bubblesort();
	long end = System.currentTimeMillis();
	System.out.println(end - checkpoint2);
    }
}	
/* Normal Test - 10 4-digit numbers - Both Ran for 0 ms.
First Test - 10000 3-digit numbers - 11 seconds , 18 seconds.
Second Test - 100000 3-digit numbers - 21 seconds, 40 seconds.
Third Test - 1000000 3-digit numbers - 59 seconds, 357 seconds.
Fourth Test - 10000 20-digit numbers - 1 seconds, 38 seconds.
Fifth Test - 100000 20-digit numbers - 7 seconds, 145 seconds.
Sixth Test - 1000000 20-digit numbers - 9 seconds, 2421 seconds.
*/
