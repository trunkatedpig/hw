import java.util.*;
import java.io.*;

public class Sort {

    private ArrayList[] buckets = new ArrayList[10];
    private int[] nums;
    private int compFreqs,swapperFreqs;
    private int digits, size;
    Random rand = new Random();

    public Sort() {
	compFreqs = 0;
	swapperFreqs = 0;
	nums = new int[10];
	for (int i = 0; i<nums.length; i++)
	    nums[i] = rand.nextInt(15);
	digits = 2;
	size = 15;
    }


    public Sort(int d, int s) {
        digits = d;
        size = s;
        nums = new int[size];
        int range = 1;
        for (int j = 0; j<digits; j++)
            range = range * 10;
        for (int i = 0; i<size; i++)
            nums[i] = rand.nextInt(range);
    }

    public String toString() {
        return Arrays.toString(nums);
    }

    public int[] getNums() {
	return nums;
    }
    
    public int getComp() {
	return compFreqs;
    }

    public int getSwap() {
	return swapperFreqs;
    }

    public int[] bSort(int[] a) {
	int[] tempArray = new int[a.length];
	tempArray = a;
	for (int i = 0; i<a.length; i++){
	    for (int j = 0; j < a.length-1; j++){
		compFreqs++;
		if (tempArray[j] > tempArray[j+1]){
		    swapperFreqs++;
		    int temp = tempArray[j];
		    tempArray[j] = tempArray[j+1];
		    tempArray[j+1] = temp;
		}
	    }
	}
	return a;
    }

    public void radixSort() {
        for (int a=0; a<10; a++)
            buckets[a] = new ArrayList();
        for (int b = 0; b<digits; b++){
            for (int c = 0; c<nums.length; c++){
                int z = nums[c];
                for (int d=b; d>0; d--)
                    z = z/10;
                z = z%10;
                buckets[z].add(nums[c]);
            }
            for (int e=0; e<nums.length; e++){
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
    
}
