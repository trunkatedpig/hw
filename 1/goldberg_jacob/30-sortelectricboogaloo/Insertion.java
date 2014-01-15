import java.util.*;
import java.io.*;

public class Insertion{

    private int[] A;
    private Random r = new Random();
    private int swaps = 0;
    private int comps = 0;

    public Insertion(int x){
	A = new int[x];
	for (int i = 0; i < x; i++){
	    A[i] = r.nextInt(100);
	}
    }

    public int[] sort(){
	boolean placed = false;
	for(int i = 1; i < A.length; i++){
	    placed = false;
	    int j = i;
	    while ((!placed) && (j > 0)){
		comps++;
		if (A[j] < A[j-1]){
		    int temp = A[j-1];
		    A[j-1] = A[j];
		    A[j] = temp;
		    swaps++;
		}
		else{
		    placed = true;
		}
		j--;
	    }
	}
	return A;

    }

    public void getArray(){
	System.out.println(Arrays.toString(A));
    }

    public int getComps(){
	return comps;
    }

    public int getSwaps(){
	return swaps;
    }



}
