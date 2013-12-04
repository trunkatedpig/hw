import java.io.*;
import java.util.*;

public class Arrays {
    public int[] revFill(int n){
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
		    result[i] = n-i;
		return result;
    }

    public int[] makeRandom(int n, int min, int max) {
		int[] result = new int[n];
		Random r = new Random();
	
		for (int i = 0; i < n; i++) {
		    result[i] = r.nextInt(max-min) + min;
		}
		return result;
    }

    public int sum13(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
		    if (a[i] == 13 && i != a.length-1)
		    	a[i+1] = 0;
		    if (a[i] != 13)
				result += a[i];
		}
		return result;
    }

    public boolean modThree(int[] a) {
		boolean r = false;
		if (a.length < 3)
			return false;
		for (int i=0; i<=a.length-3; i++) {
			if ((a[i]%2==0 && a[i+1]%2==0 && a[i+2]%2==0) || (a[i]%2!=0 && a[i+1]%2!=0 && a[i+2]%2!=0) )
				return true;
		}
		return false;
    }

    public static void main(String[] args) {
    	Arrays a = new Arrays();
    	int[] k = a.revFill(10);
    	for (int i=0;i<k.length;i++)
    		System.out.println(k[i]);
    	System.out.println();

    	int[] n = a.makeRandom(10, 0, 10);
    	for (int b=0;b<k.length;b++)
    		System.out.println(n[b]);
    }
}