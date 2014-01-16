import java.io.*;
import java.util.*;

public class Sorter{

    private ArrayList[] buckets = new ArrayList[10];
    private int[] nums;
    private int digits, size;
    private int compFreqs,swapFreqs;
    Random r = new Random();

//Default Constructor (ten 4-digit integers)
    public Sorter(){
        nums = new int[10];
        for (int i = 0; i<10; i++)
        nums[i] = r.nextInt(10000);
        digits = 4;
        size = 10;
    }

//Custom Constructor (s d-digit integers)
    public Sorter(int d, int s){
        digits = d;
        size = s;
        nums = new int[size];
        int range = 1;
        for (int j = 0; j<digits; j++)
         range = range * 10;
        for (int i = 0; i<size; i++)
         nums[i] = r.nextInt(range);
    }

    public String toString() {
        return Arrays.toString(nums);
    }

//Radix Sort Method
    public void radix(){
        for (int a=0; a<10; a++)
        	buckets[a] = new ArrayList();
        for (int b = 0; b<digits;b++){
        	for (int c = 0; c<nums.length; c++){
            	int z = nums[c];
              	for (int d=b; d>0; d--)
                	z = z/10;
                z = z%10;
                int y= nums[c];
                buckets[z].add(y);
         	}
         	for(int e=0; e<nums.length; e++){
                for (int f=0; f<buckets.length;f++) {
                	if (buckets[f].size() != 0) {
                        nums[e] = (Integer) buckets[f].get(0);
                        buckets[f].remove(0);
                        f = buckets.length;
                 	}
                }
         	}
		}
    }

//Bubble Sort Method
	public int[] bubble(int[] a) {
		swapFreqs = 0;
		compFreqs = 0;
		int[] tempArray = new int[a.length];
	  	tempArray = a;
	    for (int i = 0; i<a.length; i++){
	    	for (int j = 0; j < a.length-1; j++){
	        	compFreqs++;
	            if (tempArray[j] > tempArray[j+1]){
	            	swapFreqs++;
	                int temp = tempArray[j];
	                tempArray[j] = tempArray[j+1];
	                tempArray[j+1] = temp;
	            }
	        }
	    }
	    return tempArray;
    }

//Selection Sort Method
    public int[] selection(int[] a){
		swapFreqs = 0;
		compFreqs = 0;
		int[] tempArray = new int[a.length];
		tempArray = a;
	    for (int i = 0; i<a.length; i++) {
	    	int smallest = tempArray[i];
	        int tracker = i;
	        for (int j = i+1; j<a.length; j++) {
	        	if (tempArray[j] <= smallest) {
	            	smallest = tempArray[j];
	                tracker = j;
	            }
	           	compFreqs++;
			}
	        tempArray[tracker] = tempArray[i];
	        tempArray[i] = smallest;
	        swapFreqs++;
	    }
        return tempArray;
	}

//Insertion Sort Method
	public int[] insertion(int[] a) {
    	swapFreqs = 0;
        compFreqs = 0;
        int[] tempArray = new int[a.length];
        tempArray = a;
        for (int i = 0; i<a.length; i++) {
            for (int j = i; j>0; j--) {
            	if (tempArray[j] <= tempArray[j-1]) {
                	int smallest = tempArray[j];
                    tempArray[j] = tempArray[j-1];
                    tempArray[j-1] = smallest;
                    swapFreqs++;
                }
           		compFreqs++;
        	}
        }
        return tempArray;
    }

	public int getComp() {
		return compFreqs;
	}

	public int getSwap() {
		return swapFreqs;
	}

	public int[] getnums(){
		return nums;
	}

}

