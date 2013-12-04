import java.io.*;
import java.util.*;

public class MyList2 {

    private int[] data = new int[20]; 
    private int numItems = 0;
    Random R = new Random();

    
    public MyList2(){

	for (int i = 0; i < 20; i++)
	    data[i]=R.nextInt(100);
	// data = new int[20];
	// numItems = 0;
	//data = {2,3,4,5,6,23,35,44,23,45,65,23,87,10,99};
	//System.out.println(data);
    }

    public void insert(int pos, int d) {
	int[] temp = new int[data.length + 1];
	for (int i = data.length -1; i >= pos; i --){
	    temp[i + 1] = data[i];
	    temp[data.length-i] = data[data.length-i];
	} 
	temp[0] = data[0];
	temp[pos] = d;
	data = temp;
    }

    public void remove(int pos) {
	int[] temp = new int[data.length - 1];
	for (int i = 0; i<pos; i++){
	    temp[i] = data[i+1];
	}
	for (int i = pos +1; i <temp.length; i++)
	    temp[i]= data [i+1];
	if (data[pos] != 0)
	    numItems = numItems - 1;
	data = temp;
    }


    public int find(int d){
        for (int i = 0; i < data.length; i++){
	    if (data[i] == d)
		return d;
	}
	return -1;
    }
    
    public void fremove(int d){
	boolean done = false;
	for (int i = 0; i < data.length; i++){
	    if (data[i] == d && !done){
		remove(i);
		done = true;
	    }
	}
    }

    public void updateNumItems(){
	for (int i = 0; i < data.length; i++){
	    if (data[i] != 0)
		NumItems++;
	}
    }

    public String toString(){
	String s = Arrays.toString(data);
	return s;
    }

    public int size(){
	return data.lenght;
    }
    
    public int get(int pos){
	return data[pos];
    }

    public int set(int pos, int d){
	data[pos] = d;
    }

    
}
	

