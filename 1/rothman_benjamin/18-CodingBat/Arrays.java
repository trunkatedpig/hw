import java.io.*;
import java.util.*;

public class Arrays {

    Random random = new Random (); //random number generator

    public int [] revFill (int n) {

	int [] result = new int [n];
	for (int i = n; i > 0; i--) {

	    result [n-i] = i;
	    

	}

	return result;

    }


    public int [] MakeRandom (int size, int min, int max) { 

//assuming exclusive max and min
	int [] output = new int [size];

	
	for (int i = 0; i < size; i++) {

	    output [i] = random.nextInt (max-min - 1) +min + 1;

 //random number generator gives you numbers up to max - min - 2 If you get 0, min + 1 gives you the number that's higher than the min

	}

	return output;

    }


    public int sum13 (int [] nums) {

	int answer = 0;
	int n =0;

	while ( n < nums.length) {

	    if (! (nums [n]==13) ) {

	    answer = answer + nums [n];
	    n = n+1;

	    }

	    else {

		n = n + 2;

	    }

	}

	return answer;

    }


    public boolean modThree (int [] nums) {

	int even = 0;
	int odd = 0;

	for (int i = 0; i <nums.length; i++) {

	    
	    if( nums [i] % 2 == 0) {
		even = even + 1;
		odd = 0;

	    }

	    else {

		even = 0;
		odd = odd + 1;

	    }

	    if (even == 3 || odd == 3) {return true;}
	}

	return false;

    }
	    
	

}
