// Worked with Eric Wong on this

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList[] buckets = new ArrayList[10];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList();
        }


        int[] numbers = new int[100];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = r.nextInt(Integer.MAX_VALUE);
        }

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

        System.out.println(Arrays.toString(numbers));
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

        System.out.println(Arrays.toString(numbers));
    }
}
