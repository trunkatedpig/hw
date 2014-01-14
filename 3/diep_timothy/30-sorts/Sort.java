import java.util.*;
import java.io.*;

public class Sort{

    private int compFreqs;
    private int swapperFreqs;
    private int[] array;
    Random rand = new Random();

    public Sort() {
	compFreqs = 0;
	swapperFreqs = 0;
	array = new int[10];
	for (int i = 0; i<array.length; i++)
	    array[i] = rand.nextInt(15);
    }

    public int[] Bubble(int[] a){
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
    }
    
}
