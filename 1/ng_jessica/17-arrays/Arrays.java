public int[] middleWay(int[] a, int[] b) {
    int [] c = {a [1], b[1]};
    return c;
}


public int[] makeEnds(int[] nums) {
    int [] a = {nums [0], nums [nums.length -1]};
    return a; 
}


public int[] fizzArray(int n) {

    if ( n == 0 ) {
	int a [] = {};
	return a;
    }
    int a [] = new int [n];
    a [0] = 0;
    int i = 1;
    n = n - 1;
    while (n > 0) {
	a [i] = i;
	i = i + 1;
	n = n - 1;
    }
    return a;
}


public boolean only14(int[] nums) {
    int n = nums.length - 1;
    while (n >= 0) {
	if ((nums [n] == 1) || (nums [n] == 4)) {
	    n = n - 1;
	}
	else {
	    return false;
	}
    }
    return true;
}
