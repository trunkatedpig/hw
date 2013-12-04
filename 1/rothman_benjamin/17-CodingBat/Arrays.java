import java.io.*;
import java.util.*;

public class Arrays {

   

    public int[] middleWay (int[] a , int[] b) {

       int [] n = {a[1], b[1] };
	return n;

    }


    public int [] makeEnds (int[] nums) {

	if (nums.length == 1) {

	    int [] maker = {nums [0] };
	    return maker;

	}

	else {


	int [] maker = {nums[0], nums [nums.length - 1] };
	return maker;

	}
    }

    public int[] fizzArray (int n) {

	int [] f = new int [n];

	for (int i = 0; i < n; i++) {

	    f[i] = i;

	}

	return f;

    }


    public boolean only14 (int [] nums) {

	for (int i = 0; i < nums.length; i++) {

	    if (!(nums [i] == 1) && !(nums [i] == 4)) {
		return false;

	    }

	}

	return true;

    }
	    

}


