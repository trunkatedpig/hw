import java.io.*;
import java.util.*;

public class Array {

    public int[] Revfill(int n) {
	int[] revfill = new int[n];
	int a= 0;
	while (n>0) {
	    revfill[a] = n;
	    a = a + 1;
	    n = n - 1;
	}
	return revfill;
    }

    public int[] makeRandom(int n, int min, int max) {
	int[] random = new int[n];
	int add;
	Random r = new Random();
	for (int i=0; i < n; i ++) {
	    add = r.nextInt(max-min) + min;
	    random[i] = add;
	}
	return random;
    }

    public int sum13(int[] a) {
	int sum = 0;
	for (int i=0; i < a.length; i++) {
	    if (a[i] != 13)
		sum = sum + a[i];
	}
	return sum;
    }

    public boolean modThree(int[] a) {
	int oCount=0,eCount=0;
	String last = "";
	for (int i=0; i < a.length; i ++) {
	    if (a[i]%2 == 0) {
		oCount = 0;
		eCount = eCount + 1;
	    }
	    else {
		oCount = oCount + 1;
		eCount = 0;
	    }
	    if ((eCount == 3) || (oCount == 3)) {
		return true;
	    }
	}
	return false;
    }
}