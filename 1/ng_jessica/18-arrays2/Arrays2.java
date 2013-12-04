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


public int sum13(int[] nums) {
    int a = 0;
    int b = 0;
    while (a <= nums.length - 1) {
	if (nums [a] != 13) {
	    b = b + nums [a];
	    a = a + 1;
	}
	else {
	    a = a + 2;
	}
    }
    return b;
}



public boolean modThree(int[] nums) {
    int a = 0;
    int b = 0;
    //NTS: intitialize int i in for loop
    for (int i = 0; i < nums.length; i++) {
	if ((nums[i] % 2) == 0) {
	    a = a + 1;
	    b = 0;
	}
	else {
	    b = b + 1;
	    a = 0;
	}
	if ((a == 3) || (b == 3)) {
	    return true;
	}
    }
    return false;
}
