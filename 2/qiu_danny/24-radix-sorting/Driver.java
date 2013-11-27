// Worked with Eric Wong on this

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        int arraysLength, maxValue;
        if (args.length == 2) {
            arraysLength = Integer.parseInt(args[0]);
            maxValue = Integer.parseInt(args[1]) + 1;
        }
        else {
            arraysLength = 1000000;
            maxValue = Integer.MAX_VALUE;
        }

        Random r = new Random();
        long start, end;

        ArrayList[] buckets = new ArrayList[10];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList();
        }

        int[] numbers = new int[arraysLength];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = r.nextInt(maxValue);
        }
        int[] numbersCopy = numbers;
        //System.out.println(Arrays.toString(numbers));

        int power = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > power)
                power = numbers[i];
        }
        int maxPower = 0;
        while (power > 0) {
            power /= 10;
            maxPower++;
        }

        start = System.currentTimeMillis();
        for (int n=0; n<maxPower; n++) {
            for (int i=0; i<numbers.length; i++) {
                int digit = (int) (numbers[i] / Math.pow(10, n)) % 10;
                buckets[digit].add(numbers[i]);
            }
            int numbersIndex = 0;
            for (int b=0; b<buckets.length; b++) {
                for (int e=0; e<buckets[b].size(); e++) {
                    numbers[numbersIndex] = (Integer) buckets[b].get(e);
                    numbersIndex++;
                }
            }
            for (int i=0; i<buckets.length; i++) {
                buckets[i] = new ArrayList();
            }
        }
        end = System.currentTimeMillis();
        //System.out.println(Arrays.toString(numbers));
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Arrays.sort(numbersCopy);
        end = System.currentTimeMillis();
        //System.out.println(Arrays.toString(numbersCopy));
        System.out.println(end - start);
    }
}
