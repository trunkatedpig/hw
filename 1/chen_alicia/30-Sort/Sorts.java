import java.io.*;
import java.util.*;

public class Sorts {
    private int numDig = 4;
    private int numNum = 10;
    private int[] values;
    private ArrayList[] buckets = new ArrayList[10];

    public int[] makeArray(int d, int s) {
        int[] nums = new int[s];
        int range = 1;
        for (int j = 0; j<d; j++)
            range = range * 10;
        for (int i = 0; i<s; i++) {
	    Random temp = new Random();
            nums[i] = (int)temp.nextInt(9000)+1000;
	}

        numDig = d;
	numNum = s;
	return nums;
    }
       
    public Sorts(){
	values = new int [numNum];
        for (int i=0; i<numNum; i++){
            buckets[i] = new ArrayList();
        }
        for (int x = 0; x<numNum ;x++){
            Random temp = new Random();
            values[x]= (int)temp.nextInt(9000)+1000;
        }
    }

    public Sorts(int dig,int nums){
	numDig = dig;
	numNum = nums;
        buckets = new ArrayList[nums];
        values = new int[nums];
        
        for (int i=0; i<nums; i++){
            buckets[i] = new ArrayList();
        }
        for (int x = 0; x<nums;x++){
            Random temp = new Random();
	                values[x]= (int)temp.nextInt(9000)+1000;
        }
    }


    public int[] radixSort( int[] l){
	int[] temp = l;
        for (int n = 0;n<numDig; n++){
            for (int y=0; y<numNum;y++){
                buckets[(int)(temp[y]/Math.pow(10,n)) %10].add(temp[y]);
            }
            int a = 0;
            for (int z = 0; z <numNum; z ++){
                for (int r = 0; r <buckets[z].size(); r ++){
                    temp[a]=(Integer)buckets[z].get(r);
                    a= a+1;
                }
            }
            for (int b = 0; b < buckets.length; b ++){
                buckets[b].clear();
            }
        }
	return temp;
    }

    public int[] bSort( int[] a) {
	int comps =0;
	int swaps =0;
	int[] temp = a;
	boolean done = false;
        for (int i = 0; i < temp.length && done != true; i ++){
            done = true;
            for (int j = 0; j < temp.length -1 -i; j ++){
		comps ++;
                if (temp[j] > temp[j+1]){
		    int bigger = temp[j];
		    temp [j] = temp [j+1];
		    temp [j+1] = bigger;
		    swaps++;
		    done = false;
		}
            }
	}
        System.out.println("Comparisons: " + comps);
        System.out.println("Swaps: " + swaps);
        return temp;
    }
                            


    public int[] insertionSort(int[] array){
	int swaps=0;
	int comps = 0;
	int[] a = array;
	for (int i = 0; i<array.length; i ++){
	    for (int j = i; j>0; j--) {
                if (a[j] < a[j-1]) {
                    int temp =a[j];
                    a[j] = a[j-1];
		    a[j-1] = temp;
                    swaps++;
                }
                comps++;
            }
        }
        System.out.println("Comparisons: " + comps);
        System.out.println("Swaps: " + swaps);
        return a;
    }

    public int[] selectionSort(int[] array) {
        int swaps= 0;
        int comps = 0;
        int[] a = array;
        for (int i = 0; i<array.length; i++) {
            int temp = a[i];
            int min = i;
            for (int j = i+1; j<a.length; j++) {
                if (a[j] <= temp) {
                    temp = a[j];
                    min = j;
                }
                comps++;
            }
            a[min] = a[i];
            a[i] = temp;
            swaps++;
        }
        System.out.println("Comparisons: " + comps);
        System.out.println("Swaps: " + swaps);
        return a;
    }                  
}
