public int [] reverseFill (int n) {
    int a [] = new int [n]; 
    int i = 0; 
    while (n > 0) {
	a [i] = n;
	i = i + 1; 
	n = n - 1; 
    }
    return a; 
}

public int [] makeRandom (int n, int min, int max) {
    int a [] = new int [n];
    while (n > 0) {
	int r = Math.random (); 
	if ((r <= min) && (r>= max)) {
	    a [n] = r;
	    n = n - 1;
	}
    }
}


//not working
public int sum13(int[] nums) {
    int a = nums.length - 1;
    int b = 0;
    while (a > 0) {
	if (nums [a] != 13) {
	    b = b + nums [a];
	    a = a - 1;
	}
	else {
	    a = a - 1;
	}
    }
    return b; 
}


public boolean modThree(int[] nums) {
    int i = 0; 
    int a = 0; 
    int b = 0;
    while (i < nums.length) {
   
	if (nums[i] % 2 == 0) {
	    a = a + 1
		b = 0;
	    i = i - 1;
	}
	else {
	    b = b + 1;
	    a = 0;
	    i = i - 1;
	}
   
	if ((a ==3) || (b == 3)) {
	    return true
		}
	return false;
  
    }
