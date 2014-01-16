import java.io.*;
import java.util.*;

public class Radix {

    private int digits = 4;
    private int numNum = 10;
    private int[] values = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
   
    public Radix(){
        for (int i=0; i<numNum; i++){
            buckets[i] = new ArrayList();
        }
        for (int i=0; i<numNum; i++){
            Random temp = new Random();
            values[i]= (int)temp.nextInt(9000)+1000;
        }
    }
    
    public Radix(int dig,int nums){
        buckets = new ArrayList[nums];
        values = new int[nums];
        digits = dig;
        numNum = nums;
        for (int i=0; i<nums; i++){
            buckets[i] = new ArrayList();
        }
        for (int x=0; x<nums; x++){
            Random temp = new Random();
            values[x]= (int)temp.nextInt(9000)+1000;
        }
    }

    public int[] getArray() {
	return values;
    }

    public void radixSort(){
        for (int i=0; i<digits; i++){
            for (int j=0; j<numNum; j++){
                buckets[(int)(values[j]/Math.pow(10,i))%10].add(values[j]);
            }
            int n=0;
            for (int m=0; m<numNum; m++){
                for (int k=0; k<buckets[m].size(); k++){
                    values[n]=(Integer)buckets[m].get(k);
                    n=n++;
                }
            }
            for (int b=0; b<buckets.length; b++){
                buckets[b].clear();
            }
        }
    }


    public String toString(int[] a){
        return Arrays.toString(a);
    }

    // BUBBLE SORT STUFF STARTS HERE
    protected int bubbleCompare = 0;
    protected int bubbleSwap = 0;
    public int[] bSort(int[] array) {
	/*
	for (int i=0; i<array.length-1; i++) {
	    for (int j=0; j<array.length-2; j++) {
		count++;
		if (array[j] > array[j+1]) {
		    int temp = array[j];
		    array[j] = array[j+1];
		    values[j+1] = temp;
		    swaps++;
		}
	    }
	}
	*/
	//OPTIMZIED
	for (int j=array.length-1; j>0; j--) {
	    for (int i=0; i<j-1; i++) {
		if (array[i]>array[i+1]) {
		    int temp = array[i];
		    array[i] = array[i+1];
		    array[i+1] = temp;
		    bubbleSwap = bubbleSwap + 3;
		}
		bubbleCompare++;
	    }
	}
	return array;
    }

    //SELECTION SORT
    protected int selectCompare=0;
    protected int selectSwap=0;
    public int[] selection(int[] array) {
	int smallest;
	int index=0;
	for (int j=0; j<array.length-1; j++) {
	    smallest = array[j];
	    for (int i=index; i<array.length-1; i++) {
		if (smallest>array[i+1]) {
		    smallest = array[i+1];
		    index = i+1;
		}
		selectCompare++;
	    }
	    int temp = array[j];
	    array[j] = smallest;
	    array[index] = temp;
	    selectSwap++;
	}
	return array;
    }

    //INSERTION SORT
    protected int insertCompare = 0;
    protected int insertSwap = 0;

    public int[] insertion(int[] array) {
	int temp;
	for (int i=1; i<array.length; i++) {
	    for (int j=i; j>0; j--) {
		if (array[j]<array[j-1]) {
		    temp = array[j-1];
		    array[j-1] = array[j];
		    array[j] = temp;
		    insertSwap = insertSwap + 3;
		}
		insertCompare++;
	    }
	}
	return array;
    }
}
