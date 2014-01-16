import java.io.*;
import java.util.*;

public class Sort {
    /*
    -----radixSort taken from Terrance Liang (since I can't find my own)-----;
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

    public int[] makeArray() {
	Random r = new Random();
        int[] numbers = new int[10000];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }
	return numbers;

    }

    public void bubble() {
	int[] numbers = makeArray();
	int[] sort = numbers;
	long start,end;
	int comps = 0, swaps = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<sort.length-1;i++) {
	    for (int j=0;j<sort.length-1;j++) {
		if (sort[j]>sort[j+1]) {
		    int small = sort[j+1];
		    int large = sort[j];
		    sort[j+1] = large;
		    sort[j] = small;
		    swaps++;	
		}
		comps++;
	    }
	}
	end = System.currentTimeMillis();
	System.out.println("Comparisons: " + comps);
	System.out.println("Swaps: " + swaps);
	System.out.println("Time: " + (end-start));
    }

    public void selection() {
        int [] numbers = makeArray();
	int[] sort = numbers;
	long start,end;
	int comps = 0, swaps = 0;
	int min;
	start = System.currentTimeMillis();
	for (int n = 0; n <sort.length-1; n++){
	    min = n;
	    for (int i=n+1;i<sort.length;i++) {
		comps ++;
	        if (sort[i]<sort[min]){
		    min = i;
		}
	    }
	    if (min != n){
		swaps ++;
		int val = sort[n];
		sort[n]=sort[min];
		sort[min]=val;
	    }
	}
	end = System.currentTimeMillis();
	System.out.println("Comparisons: " + comps);
	System.out.println("Swaps: " + swaps);
	System.out.println("Time: " + (end-start));
    }

    public void insertion(){
	int [] numbers = makeArray();
	int[] sort = numbers;
	long start,end;
	int comps = 0, swaps = 0;
	start = System.currentTimeMillis();
	for (int i = 2; i < sort.length; i ++){
	    for (int j = i; (j > 0&&sort[j] < sort[j-1]); j --){
		comps ++;
		swaps ++;
		int val = sort[j];
		sort[j]=sort[j-1];
		sort[j-1]= val;
	    }
	}
	end = System.currentTimeMillis();
	System.out.println("Comparisons: " + comps);
	System.out.println("Swaps: " + swaps);
	System.out.println("Time: " + (end-start));
    }
		    

    public static void main(String args[]) {

	Sort s = new Sort();
	System.out.println("\nBubble Sort");
	s.bubble();
	System.out.println("\nSelection Sort");
	s.selection();
	System.out.println("\nInsertion Sort");
	s.insertion();
    }


}
