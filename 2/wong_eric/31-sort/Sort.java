cd// Worked with Eric Wong on this

import java.util.*;

public class Sort {

    /*
    public void radixSort() {
	long start,end;
	Random r = new Random();

        ArrayList[] buckets = new ArrayList[10];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList();
        }


        int[] numbers = new int[100];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = r.nextInt(100);
        }
	int[]numbersCopy = numbers;
	System.out.println(Arrays.toString(numbers));

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
        System.out.println(Arrays.toString(numbers));
	System.out.println(end - start);

	start = System.currentTimeMillis();
	Arrays.sort(numbersCopy);
	end = System.currentTimeMillis();
	System.out.println(end-start);
    }
    */

    public double[] list() {

        double[] numbers = new double[10];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = Math.random()*100;
        }

    }

    public void bubble() {
	
	numbers = list();

	double[] sort = numbers;
	int comp = 0;
	int swap = 0;

	for (int j=0;j<sort.length-1;j++) {
	    for (int i=0;i<sort.length-1;i++) {
		if (sort[i]>sort[i+1]) {
		    double small = sort[i+1];
		    sort[i+1] = sort[i];
		    sort[i] = small;
		    swap++;	
		}
		comp++;
	    }
	}

	System.out.println(Arrays.toString(numbers));
	System.out.println(Arrays.toString(sort));
	System.out.println("Ifs: " + comp);
	System.out.println("Swaps: " + swap);
    }

    public void selection() {

	numbers = list();

	for (int i=1;i<numbers.length-1;i++) {
	    for (int j=i;j>0;j--) {

	    }

	    if (

	}

    }

    public static void main(String args[]) {

	Sort s = new Sort();
	s.bubble();

    }


}
