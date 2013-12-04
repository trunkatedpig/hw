import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	ArrayStuff as;
	as = new ArrayStuff();
	int[] a = {1,2,3};
	int[] b = {4,5,6};
	System.out.println(a[1]);
	System.out.println(b[1]);
	System.out.println(as.middleWay(a,b));
	System.out.println(as.makeEnds(a));
	System.out.println(as.fizzArray(5));
	System.out.println(as.only14(a));

	//first 3 tests not working, ArrayStuff code  works though
    }
}
