import static java.lang.Math.pow;
import static java.lang.System.nanoTime;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Sort {
	public static int[] bubbleSort(int[] array) {
		int comparisons, swaps;
		comparisons = swaps = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				comparisons++;
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					swaps++;
				}
			}
		}
		System.out.println(Arrays.toString(array) + "\nComparisons: " + comparisons + "\nSwaps: " + swaps);
		return array;
	}
	
	public static int[] radixSort(int[] array) {
		//@SuppressWarnings(value = "unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[10];
		for (int i = 0; i < 10; i++) {buckets[i] = new ArrayList<Integer>();} //Sort of generic array creation. This will still generate unchecked warnings but each ArrayList will be type Integer.
		
		int maximum = array[0];
		for (int i = 1; i < array.length; i++) {if (array[i] > maximum) {maximum = array[i];}}
		byte max = -1;
		for (; maximum > 0; maximum /= 10) {max++;} //A while loop would work but one-line code FTW.
		//   ^ Yes, that is valid.
		
		for (byte i = 0; i <= max; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] < (int) pow(10, i)) {buckets[0].add(array[j]);}
				else {buckets[(array[j] / (int) pow(10, i)) % 10].add(array[j]);}
			}
			int index = 0;
			for (byte j = 0; j < 10; j++) {
				for (int k = 0; k < buckets[j].size(); k++) {
					array[index] = buckets[j].get(k);
					index++;
				}
				buckets[j].clear();
			}
		}
		return array;
	}
	
	public static int[] randomIntArray(int length, int max) {
		int[] array = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {array[i] = random.nextInt(max);}
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = randomIntArray(100, 100);
		long t1, t2;
		t1 = nanoTime();
		bubbleSort(array);
		t2 = nanoTime();
		System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");
		System.out.println();
		t1 = nanoTime();
		System.out.println(Arrays.toString(radixSort(array)));
		t2 = nanoTime();
		System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");
	}
}
