import java.io.*;
import java.util.*;

public class arraystuff{

    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }

    public int find(int n){
	for(int i = 0; i< data.length-1; i++){
	    if (data[i]=n){
		return data[i];}
	}
    }
    public void fremove(int n){
	for (int i=o; i<data.length-1;i++){
	    if (data[i]=n){
		data.remove(n);
	    }
	}
    }
    