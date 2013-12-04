import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.pow;

public class Sort {
	public static int[] sort(int[] numbers) {
		//@SuppressWarnings(value = "unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[10];
		for (int i = 0; i < 10; i++) {buckets[i] = new ArrayList<Integer>();} //Sort of generic array creation. This will still generate unchecked warnings but each ArrayList will be type Integer.
		
		int maximum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {if (numbers[i] > maximum) {maximum = numbers[i];}}
		byte max = -1;
		for (; maximum > 0; maximum /= 10) {max++;} //A while loop would work but one-line code FTW.
		//   ^ Yes, that is valid.
		
		for (byte i = 0; i <= max; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] < (int) pow(10, i)) {buckets[0].add(numbers[j]);}
				else {buckets[(numbers[j] / (int) pow(10, i)) % 10].add(numbers[j]);}
			}
			int index = 0;
			for (byte j = 0; j < 10; j++) {
				for (int k = 0; k < buckets[j].size(); k++) {
					numbers[index] = buckets[j].get(k);
					index++;
				}
				buckets[j].clear();
			}
		}
		
		return numbers;
	}
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Sort size max, in which size is the number of elements and max is the upper bound (exclusive) of the array of integers");
			return;
		}
		if (!((args[0] + args[1]).matches("[0-9]+"))) {
			System.out.println("size and max must be non-negative integers");
			return;
		}
		BigInteger _size = new BigInteger(args[0]);
		BigInteger _max = new BigInteger(args[1]);
		BigInteger _maxInteger = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		if ((_size.compareTo(_maxInteger) == 1) || (_max.compareTo(_maxInteger) == 1)) {
			System.out.println("size and max must not exceed the maximum integer");
			return;
		}
		
		int size = new Integer(args[0]);
		int max = new Integer(args[1]);
		int[] numbers = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {numbers[i] = random.nextInt(max);}
		
		System.out.println(Arrays.toString(Sort.sort(numbers)));
	}
}
