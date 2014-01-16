import java.io.*;
import java.util.*;
public class Sorts{

    ArrayList[] buckets = new ArrayList[10];
    int placevalue = 0;
    int k = 1;

    public Sorts(){
	for (int i = 0; i < buckets.length; i++){
	    buckets[i]=new ArrayList();
	}
    }

    public int[] radixSort(int[] nums, int digits){   //need to put in digit of the highest number
	int[] temp=nums;
	for (int q = 0; q < digits; q ++){ 
	for (int i = 0; i < nums.length; i ++){
	    placevalue = (temp[i]/k) % 10;       //finds the digit at the ones/tens/hundreds/etc. place
	    for (int x = 0; x < buckets.length; x ++){
		if (placevalue == x)            //adds the number to the buckets based on placevalue
		    buckets[x].add((Integer)temp[i]);
	    }
	}
	for (int i = 0; i < nums.length; i ++){ //putting back semi organized #'s into temp array
	    int pos = 0;
	    while(buckets[pos].isEmpty()){      //can't remove from an arraylist if its empty
		pos = pos + 1;
	    }
	    temp[i]=(Integer)buckets[pos].remove(0);
	}
	k = k *10; //increase divisor from 1 to 10 to 100 to etc.
	}
	return temp;
    }

    public int[] bSort(int[] nums){ 
	int[] temp = nums;
	int swaps = 0;
	int comparisons = 0;
	for(int k = 0; k <= nums.length; k++){
	    boolean test = true;
	    for(int i = 0; i < nums.length - 1 - k; i++){
		if(temp[i] > temp[i+1]){
		    int x = temp[i];
		    temp[i] = temp[i+1];
		    temp[i+1] = x;
		    swaps = swaps + 1;
		    test = false;
		}
		comparisons = comparisons + 1;
	    }
	    if(test){
		System.out.println("Number of swaps:" + swaps);
		System.out.println("Number of comparisons:" + comparisons);
		return temp;
	    }
	}
	System.out.println("Number of swaps:" + swaps);
	System.out.println("Number of comparisons:" + comparisons);
	return temp;
    }

    public int[] insertionSort(int[] nums){
	int[] result = nums;
	int swaps = 0;
	int comparisons = 0;
	for(int i = 1; i < nums.length; i++){
	    boolean test = false;
	    int temp = result[i];
	    for(int k = 0; k < nums.length && test == false; k++){
		if(k == 0 && temp <= nums[k]){
		    nums[i] = nums[k];
		    nums[k] = temp;
		    swaps = swaps + 1;
		}
	        if(k > 0 && temp > nums[k-1] && temp < nums[k]){
		    nums[i] = nums[k];
		    nums[k] = temp;
		    swaps = swaps + 1;
		}
		comparisons = comparisons + 1;
	    }
	}
	System.out.println("Number of swaps:" + swaps);
	System.out.println("Number of comparisons:" + comparisons);
	return result;
    }

    public int[] selectionSort(int[] nums){
	int[] result = nums;
	int swaps = 0;
	int comparisons = 0;
	int temp = 0;
	int index = 0;
	for(int i = 0; i < result.length; i ++){
	    boolean begin = true;
	    temp = result[i];
	    for (int k = i; i < result.length; k++){
		comparisons = comparisons + 1;
		if(temp < result[k]){
		temp = result[k];
		index = k;
		}
	    }
	    result[k] = result[i];
	    result[i] = temp;
	    swaps = swaps + 1;
	}
	System.out.println("Number of swaps:" + swaps);
	System.out.println("Number of comparisons:" + comparisons);
	return result;
    }

}



