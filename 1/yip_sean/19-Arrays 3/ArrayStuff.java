import java.util.*;

public class ArrayStuff {
	private int[] a = new int[20];
	private Random random = new Random();
	
	public ArrayStuff() {for (int i = 0; i < a.length; i++) {a[i] = random.nextInt(100);}}

	public String toString() {return Arrays.toString(a);}
	
	public int find(int n) {
		for (int i = 0; i < a.length; i++) {if (a[i] == n) {return i;}}
		
		return -1;
	}
	
	public int max() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {if (a[i] > max) {max = a[i];}}
		
		return max;
	}
	
	public int maxIndex() {return find(max());}
	
	public int sum() {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {sum += a[i];}
		
		return sum;
	}
	
	public double mean() {return (double) sum() / a.length;}
	
	public double stddev() {
		double mean = mean(); //Avoid recalculation
		double sumDifferences = 0.0;
		for (int i = 0; i < a.length; i++) {sumDifferences += Math.pow(a[i] - mean, 2);}
		
		return Math.pow(sumDifferences / a.length, 0.5);
	}
	
	public static void main(String[] args) {
		ArrayStuff as = new ArrayStuff();
		System.out.println(as);
		System.out.println(as.find(50));
		System.out.println(as.max());
		System.out.println(as.maxIndex());
		System.out.println(as.mean());
		System.out.println(as.stddev());
	}
}