import java.io.*;
import java.util.*;

public class myList {
    int[] data;
    Random r = new Random();

    public myList(int length, int max) {
        data = new int[length];
        for (int i=0;i<length;i++) {
	    data[i] = r.nextInt(max);
        }        
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public int remove(int pos){
	int[] result = new int[data.length-1];
	int ans = data[pos];
	for(int i=0; i<pos; i++){
	    result[i] = data[i];
	}
	for(int j=pos; j<data.length-1; j++){
	    result[j] = data[j+1];
	}
	data = result;
	return ans;
    }
}