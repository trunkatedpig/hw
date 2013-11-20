import java.io.*;
import java.util.*;

public class myList3{

    private int[] data;
    private int numItems;
    
    public myList3() {
        data = new int[5];
        numItems=0;
    }

    public int find(int n){
	for (int i = 0; i< data.length-1; i++){
	    if (data[i]==n){
		return data[i];}
	}
	return 0;
    }
     
    public void remove(int pos) {
	for (int i=pos; i<numItems-1; i++) {
            data[i] = data[i + 1];
        }
        numItems--;  
    }

      public void fremove(int n){
	for (int i=0; i<data.length-1;i++){
	    if (data[i]==n){
		remove(n);
	    }
	
	}
      }
}
