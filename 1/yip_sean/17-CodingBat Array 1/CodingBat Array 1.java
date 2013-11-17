public int[] middleWay(int[] a, int[] b) {
	return new int[] {a[1], b[1]};
}

public int[] makeEnds(int[] a) {
	return new int[] {a[0], a[a.length - 1]};
}

public int[] fizzArray(int n) {
	if (n <= 0) {return new int[0];}
	
	int[] result = new int[n];
	for (int i = 0; i < n; i++) {result[i] = i;}
	
	return result;
}

public boolean only14(int[] a) {
	boolean result = true;
	
	for (int i = 0; i < a.length; i++) {result = result && ((a[i] == 1) || (a[i] == 4));}
	
	return result;
}