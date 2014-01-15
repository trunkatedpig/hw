import java.util.*;
import java.io.*;

public class Selection{

    private int[] A;
    private Random r = new Random();
    private int swaps = 0;
    private int comps = 0;

    public Selection(int x){
	A = new int[x];
	for (int i = 0; i < x; i++){
	    A[i] = r.nextInt(100);
	}
    }

    public int[] sort(){

	for(int i = 0; i < A.length - 1; i++){
	    int lowest = A[i];
	    int winner = i;
	    for(int j = i+1; j < A.length; j++){
		comps++;
		if(A[j] < lowest){
		    lowest = A[j];
		    winner = j;
		}
	    }
	    int temp = A[i];
	    A[i] = A[winner];
	    A[winner] = temp;
	    swaps++;
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
