import java.util.*;
import java.io.*;

public class Arrays {
    private Random r = new Random();

    public String printArray (int[] x) {
	int i = 0;
	System.out.print("[");
	for (i = 0; i < x.length; i++) {
	    if (i + 1 == x.length) {
		System.out.println(x[i] + "]");
		return "";
	    }	    
	    System.out.print(x[i] + ", ");
	}
	System.out.println("]");
	return "";
    }

    public int[] RevFill (int n) {
	int[] x = new int[n];
	int i = 0;
	while (i < n) {
	    x[i] = i;
	    i = i + 1;
	}
	printArray(x);
	
	return x;
    }

    public int[] MakeRandom (int size, int min, int max) {
	int[] x = new int[size];
	int i = 0;
	while (i < size) {
	    int randNum = r.nextInt(max-min);
	    x[i] = min + randNum;
	    i = i + 1;
	}
	printArray(x);

	return x;
    }

    public int sum13 (int[] nums) {
	int x = 0;

	int i = 0;
	while (i < nums.length) {
	    if (nums[i]!=13) {
		x = x + nums[i];
	    }
	    else {
		i = i + 1;
	    }
	    i = i + 1;
	}

	return x;
    }

    public boolean modThree (int[] nums) {
	int conEven = 0;
	int conOdd = 0;

	int i = 0;
	while (i < nums.length) {
	    if ((nums[i] % 2) == 0) {
		conEven = conEven + 1;
		conOdd = 0;
	    }
	    else {
		conEven = 0;
		conOdd = conOdd + 1;
	    }
	    i = i + 1;

	    if (conEven == 3 || conOdd == 3) {
		return true;
	    }

	}
        return false;
    }

}
