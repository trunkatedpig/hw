import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Factorial f;
	f = new Factorial();

	int i, j, k, l, m, n;
	i = 0;
	j = 1;
	k = 2;
	l = 3;
	m = 4;
	n = 5;

	System.out.println("Factorials: in each pair of numbers,");
	System.out.println("the first test uses a method with if statements, and");
	System.out.println("the second test uses a method with a while loop.");
	System.out.println();

	System.out.println(i + "-->" + f.fact(i));
	System.out.println(i + "-->" + f.fact2(i));
	System.out.println();

	System.out.println(j + "-->" + f.fact(j));
	System.out.println(j + "-->" + f.fact2(j));
	System.out.println();

	System.out.println(k + "-->" + f.fact(k));
	System.out.println(k + "-->" + f.fact2(k));
	System.out.println();

	System.out.println(l + "-->" + f.fact(l));
	System.out.println(l + "-->" + f.fact2(l));
	System.out.println();

	System.out.println(m + "-->" + f.fact(m));
	System.out.println(m + "-->" + f.fact2(m));
	System.out.println();

	System.out.println(n + "-->" + f.fact(n));
	System.out.println(n + "-->" + f.fact2(n));

    }

}
