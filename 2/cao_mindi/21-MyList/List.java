import java.io.*;
import java.util.*;

public class List{
    private int[] data = new int[10];
    private int numItems = 0;
    
    public List(){}    

    public void insert(int pos, int n){
	int[] tmp = new int[data.length + 1];
	for (int i = 0; i < pos; i = i + 1){
	    tmp[i] = data[i];
	}
	tmp[pos] = n;
	for (int i = pos; i < data.length; i ++){
	    tmp[i + 1] = data[i];
		}
	data = tmp;
	System.out.println(data);
}

    public String toString(){
	String s = Arrays.toString(data);
	return s;
    }

}
