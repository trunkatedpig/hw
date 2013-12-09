// Worked with Eric Wong on this

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        RandomGen r = new RandomGen();
        long start, end;
        long maxValue = Long.MAX_VALUE;
        int arraysLength;
        if (args.length == 1)
            arraysLength = Integer.parseInt(args[0]);
        else if (args.length == 2) {
            arraysLength = Integer.parseInt(args[0]);
            maxValue = (long) Math.pow(10, Integer.parseInt(args[1]));
        }
        else if (args.length > 2)
            arraysLength = args.length;
        else
            arraysLength = 1000000;

        ArrayList[] buckets = new ArrayList[10];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList();
        }

        long[] numbers = new long[arraysLength];
        for (int i=0; i<numbers.length; i++) {
            if (args.length > 2)
                numbers[i] = Long.parseLong(args[i]);
            else if (args.length == 2)
                numbers[i] = r.nextLong(maxValue);
            else
                numbers[i] = Math.abs(r.nextLong());
        }
        long[] numbersCopy = numbers;
        //System.out.println(Arrays.toString(numbers));

        long maxNumber = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > maxNumber)
                maxNumber = numbers[i];
        }
        int maxPower = 0;
        while (maxNumber > 0) {
            maxNumber /= 10;
            maxPower++;
        }

        start = System.nanoTime();
        for (int n=0; n<maxPower; n++) {
            for (int i=0; i<numbers.length; i++) {
                int digit = (int) (numbers[i] / Math.pow(10, n)) % 10;
                buckets[digit].add(numbers[i]);
            }
            int numbersIndex = 0;
            for (int b=0; b<buckets.length; b++) {
                for (int e=0; e<buckets[b].size(); e++) {
                    numbers[numbersIndex] = (Long) buckets[b].get(e);
                    numbersIndex++;
                }
            }
            for (int i=0; i<buckets.length; i++) {
                buckets[i] = new ArrayList();
            }
        }
        end = System.nanoTime();
        //System.out.println(Arrays.toString(numbers));
        System.out.println((end - start) / 1000000.);

        start = System.nanoTime();
        Arrays.sort(numbersCopy);
        end = System.nanoTime();
        //System.out.println(Arrays.toString(numbersCopy));
        System.out.println((end - start) / 1000000.);
    }
}

/* Results (in milliseconds: Radix - Quicksort)
 * int[] a = {5,3,67,2,11,787,3,6,1}:     .735 - .166
 * An array of 10,000 3 digit numbers:    31.38 - 3.507
 * An array of 100,000 3 digit numbers:   82.739 - 24.407
 * An array of 1,000,000 3 digit numbers: 856.888 - 118.602
 * An array of 10,000 18 digit numbers (Long.MAX_VALUE):    56.78 - .697
 * An array of 100,000 18 digit numbers (Long.MAX_VALUE):   306.143 - 16.971
 * An array of 1,000,000 18 digit numbers (Long.MAX_VALUE): 3149.106 - 154.281
 */
