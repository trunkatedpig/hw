import java.io.*;
import java.util.*;

public class ArraysThree {

 private int[] a;
 private Random r = new Random();
    
public ArraysThree() {
int[] a = new int[20];
for (int i=0;i<a.length;i++) {
	a[i]=r.nextInt(100);
	}
}

public double mean(int[] g){
	double sum = 0;
	for (int i = 0 ; i<g.length ; i++) {
		sum = sum + g[i];}
	double m = sum / (g.length);
	return m;
	}

public double lmean(long[] g){
	double sum = 0;
	for (int i = 0 ; i<g.length ; i++) {
		sum = sum + g[i];}
	double m = sum / (g.length);
	return m;
	}
	
public double stddev() {
	double x = mean(a);
	long[] b = new long[20];
	for (int i = 0; i < 20; i++) {
		double l = a[i] - x;
		l = l * l;
		b[i] = Math.round(l);
	}
	return Math.sqrt(lmean(b));
}
}