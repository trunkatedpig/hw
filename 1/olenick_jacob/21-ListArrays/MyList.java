import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
        data =new int[10];
        numItems=0;
    }
    
    public void add(int d) {

        if (numItems>=data.length) {
            System.out.println("Growing");
            int[] tmpArray = new int[data.length+1];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        
        // then add
        data[numItems]=d;
        numItems=numItems+1;
    }

    public void insert(int pos, int d){
	int[] A = new int[data.length + 1];
	for (int i=0; i < A.length; i++){
	    if (i<pos){
		A[i] = data[i];
	    }
	    else if (i == pos){
		A[i] = d;
	    else{
		A[i] = data[i-1];
	    }
	}
	data = A;
	numItems++;
    }
    
    public String toString() {
        String s =Arrays.toString(data)+" --- " +numItems;
        return s;
    }
}
