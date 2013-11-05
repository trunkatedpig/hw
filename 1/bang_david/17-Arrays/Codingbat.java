public class Codingbat {

    public int[] middleWay(int[] a, int[] b) {
	int a1 = a[1];
	int b1 = b[1];
	int [] c = new int [2];
	c [0] = a1;
	c [1] = b1;
	return c;
    

    }

    public int[] makeEnds(int[] nums) {
	int [] a = new int [2];
	a [0] = nums [0];
	a [1] = nums [nums.length -1];
	return a;
    }


    public int[] fizzArray(int n) {
	int [] a = new int [n];
	for (int b = 0; b < n; b++) {
	    a [b] = b;
	}
	return a;
    }

    public boolean only14(int[] nums) {   
  
	for (int a = 0; a < nums.length; a++) {
	    if (nums [a] != 1 && nums [a] != 4) {
		return false;
	    }
	}
	return true;
    }

}
