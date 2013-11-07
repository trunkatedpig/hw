import java.math.*;

public class Arrays {

    public String stringify(int[] a) {
	String s = "{";
	for (int i=0; i<a.length-1; i++) {
	    s = s+a[i]+",";}
	if (a.length != 0) {
	    s = s + a[a.length-1];}
	s = s + "}";
	return s;
    }
    

    public int[] Revfill(int n) {
	int[] retarray = new int[n];
	for (int i=0; i<n; i++) {
	    retarray[i] = n-i;}
	return retarray;
    }

    public int[] makeRandom(int n, int min, int max) {
	int [] retarray = new int[n];
	for (int i=0; i<n; i++) {
	    retarray[i] = (int)(min + (Math.random() * (max-min+1)));}
	return retarray;
    }

    public int sum13(int[] a) {
	int sum = 0;
	for (int i=0; i<a.length; i++) {
	    if (i > 0) {
		if ((a[i-1] != 13) && (a[i] != 13)) {
		    sum = sum + a[i];}}
	    else {
		if (a[i] != 13) {
		    sum = sum + a[i];}}}
	return sum;
    }

    public boolean modThree(int[] a) {
	if (a.length > 2) {
		for (int i=0; i<(a.length-2); i++) {
		    int num1 = a[i];
		    int num2 = a[i+1];
		    int num3 = a[i+2];
		    if ((num1%2 == num2%2) && (num2%2 == num3%2)) {
			return true;}
		}
	    }
	return false;
    }
}
