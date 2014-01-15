import static java.lang.System.nanoTime;
import java.math.BigInteger;
import java.util.Arrays;

public class SortBenchmark {
	private static void printTime(long t1, long t2) {System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");}
	
	public static void main(String[] args) {
		String usage = "Usage: java SortBenchmark <length> <maximum>\nlength is the length of the integer array to sort and maximum is the maximum (exclusive, i.e. [0, maximum)) integer in the array.";
		if (args.length != 2) {
			System.out.println(usage);
			return;
		}
		if (!((args[0] + args[1]).matches("[0-9]*"))) {
			System.out.println("length and maximum must be positive integers in interval [1, 2^31 - 1]. Enter java Benchmark for help.");
			return;
		}
		if ((Integer.valueOf(args[0]) == 0) || (Integer.valueOf(args[1]) == 0)) {
			System.out.println("length and maximum must be positive integers in interval [1, 2^31 - 1]. Enter java Benchmark for help.");
			return;
		}
		BigInteger _maximumInteger = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		BigInteger _length = new BigInteger(args[0]);
		BigInteger _maximum = new BigInteger(args[1]);
		if ((_length.compareTo(_maximumInteger) > 0) || (_maximum.compareTo(_maximumInteger) > 0)) {
			System.out.println("length and maximum must be positive integers in interval [1, 2^31 - 1]. Enter java Benchmark for help.");
			return;
		}
		
		int[] array = Sort.randomIntArray(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
		System.out.println("Original array:\n" + Arrays.toString(array) + "\n");
		
		long t1, t2;
		
		t1 = nanoTime();
		System.out.println("Bubble sort:");
		Sort.bubbleSort(array);
		t2 = nanoTime();
		printTime(t1, t2);
		
		System.out.println();
		
		System.out.println("Insertion sort:");
		t1 = nanoTime();
		Sort.insertionSort(array);
		t2 = nanoTime();
		printTime(t1, t2);
		
		System.out.println();
		
		System.out.println("Selection sort:");
		t1 = nanoTime();
		Sort.selectionSort(array);
		t2 = nanoTime();
		printTime(t1, t2);
		
		System.out.println();
		
		System.out.println("Radix sort:");
		t1 = nanoTime();
		System.out.println(Arrays.toString(Sort.radixSort(array)));
		t2 = nanoTime();
		printTime(t1, t2);
	}
}