import java.util.*;

public class ArrayListBenchmark {
	public static ArrayList<?> reverse(ArrayList<?> arrayList) {
		Collections.reverse(arrayList);
		
		return arrayList;
	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java ArrayListBenchmark max, in which max is maximum size ArrayList to benchmark (max must be greater than or equal to 10 and be a power of 10)");
			return;
		}
		if ((new Double(args[0])) < 10) {
			System.out.println("Max must be greater than or equal to 10.");
			return;
		}
		if (Math.log10((new Double(args[0]))) != Math.round(Math.log10((new Double(args[0]))))) {
			System.out.println("Max must be a power of ten.");
			return;
		}
		
		//Test reverse:
		ArrayList<Double> aL = new ArrayList<Double>(5);
		for (int i = 0; i < 5; i++) {aL.add(0.1 * (i + 1));}
		System.out.println(aL);
		System.out.println(ArrayListBenchmark.reverse(aL) + "\n");
		
		//Benchmark
		Long max = new Long((new Double(args[0])).intValue());
		ArrayList<Boolean> arrayList = new ArrayList<Boolean>(1);
		arrayList.add(true);
		long[][] times = new long[4][(int) Math.log10(max)];
		long t1, t2;
		
		for (int i = 2; i <= max; i++) {
			arrayList.add(true);
			
			if (Math.log10(i) == Math.round(Math.log10(i))) {
				t1 = System.nanoTime();
				arrayList.add(true);
				t2 = System.nanoTime();
				times[0][(int) Math.log10(i) - 1] = t2 - t1;
				
				arrayList.remove(i);
				
				t1 = System.nanoTime();
				arrayList.remove(i - 1);
				t2 = System.nanoTime();
				times[2][(int) Math.log10(i) - 1] = t2 - t1;
				
				arrayList.add(true);
				
				t1 = System.nanoTime();
				arrayList.add(0, true);
				t2 = System.nanoTime();
				times[1][(int) Math.log10(i) - 1] = t2 - t1;
				
				arrayList.remove(i);
				
				t1 = System.nanoTime();
				arrayList.remove(0);
				t2 = System.nanoTime();
				times[3][(int) Math.log10(i) - 1] = t2 - t1;
				
				arrayList.add(true); //Finally this, since the above 4 operations do not change the size of the array list
			}
		}
		
		System.out.println("Time to add to the end of an ArrayList of size n:");
		for (int i = 0; i < times[0].length; i++) {System.out.println((long) Math.pow(10, i + 1) + ": " + times[0][i] + " ns/" + ((double) times[0][i] / 1000000) + " ms/" + ((double) times[0][i] / 1000000000) + " s");} //Adding to end is constant time (~320 ns)
		
		System.out.println("\nTime to add to the beginning:");
		for (int i = 0; i < times[1].length; i++) {System.out.println((long) Math.pow(10, i + 1) + ": " + times[1][i] + " ns/" + ((double) times[1][i] / 1000000) + " ms/" + ((double) times[1][i] / 1000000000) + " s");} //Adding to beginning exponentially increases in time as the number of elements increases
		
		System.out.println("\nTime to remove from the end: ");
		for (int i = 0; i < times[2].length; i++) {System.out.println((long) Math.pow(10, i + 1) + ": " + times[2][i] + " ns/" + ((double) times[2][i] / 1000000) + " ms/" + ((double) times[2][i] / 1000000000) + " s");} //Removing from end is constant time (~320 ns)
		
		System.out.println("\nTime to remove from the beginning:");
		for (int i = 0; i < times[3].length; i++) {System.out.println((long) Math.pow(10, i + 1) + ": " + times[3][i] + " ns/" + ((double) times[3][i] / 1000000) + " ms/" + ((double) times[3][i] / 1000000000) + " s");} //Removing from beginning exponentially increases in time as the number of elements increases
	}
}
