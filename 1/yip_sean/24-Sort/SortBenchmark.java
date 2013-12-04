import java.util.*;
import static java.lang.Math.pow;
import static java.lang.System.nanoTime;

public class SortBenchmark {
	public static void main(String[] args) {
		Random random = new Random();
		long[][][] times = new long[2][8][3]; //some multi-dimensional array: [sortMethod][numItems][numDigits]
		for (byte i = 0; i <= 7; i++) {
			System.out.println("Working...");
			int[] numbers4 = new int[(int) pow(10, i)];
			int[] numbers9 = new int[(int) pow(10, i)];
			int[] numbersMax = new int[(int) pow(10, i)]; //Contains numbers with the maximum number of digits possible for an int
			
			for (int j = 0; j < (int) pow(10, i); j++) {
				numbers4[j] = random.nextInt(10000);
				numbers9[j] = random.nextInt(1000000000);
				numbersMax[j] = random.nextInt(Integer.MAX_VALUE); //Too lazy to figure out the way to include the maximum integer
			}
			
			//These copies are for sorting by the Arrays.sort method
			int[] _numbers4, _numbers9, _numbersMax;
			_numbers4 = Arrays.copyOf(numbers4, numbers4.length);
			_numbers9 = Arrays.copyOf(numbers9, numbers9.length);
			_numbersMax = Arrays.copyOf(numbersMax, numbersMax.length);
			
			long t1, t2;
			
			t1 = nanoTime();
			Sort.sort(numbers4);
			t2 = nanoTime();
			times[0][i][0] = t2 - t1;
			
			t1 = nanoTime();
			Arrays.sort(numbers4);
			t2 = nanoTime();
			times[1][i][0] = t2 - t1;
			
			t1 = nanoTime();
			Sort.sort(numbers9);
			t2 = nanoTime();
			times[0][i][1] = t2 - t1;
			
			t1 = nanoTime();
			Arrays.sort(numbers9);
			t2 = nanoTime();
			times[1][i][1] = t2 - t1;
			
			t1 = nanoTime();
			Sort.sort(numbersMax);
			t2 = nanoTime();
			times[0][i][2] = t2 - t1;
			
			t1 = nanoTime();
			Arrays.sort(numbersMax);
			t2 = nanoTime();
			times[1][i][2] = t2 - t1;
		}
		
		//How to print out the data?
		System.out.println("\nFormat: digits/number of elements: time");
		for (byte i = 0; i < 2; i++) {
			if (i == 0) {System.out.println("Time to sort with the custom-written radix method:");}
			if (i == 1) {System.out.println("\n\nTime to sort with built-in Arrays.sort method:");}
			for (byte j = 0; j <= 7; j++) {
				for (byte k = 0; k < 3; k++) {
					byte digits = 0;
					if (k == 0) {digits = 4;}
					if (k == 1) {digits = 9;}
					if (k == 2) {digits = 10;}
					System.out.println("" + digits + "/" + (int) pow(10, j) + ": " + times[i][j][k] + " ns/" + ((double) times[i][j][k] / 1000000) + " ms/" + ((double) times[i][j][k] / 1000000000) + "s");
				}
				System.out.println();
			}
		}
	}
}
