import java.util.*;

public class myList {
	private int[] data;
	private int numItems;
	
	public myList() {
		data = new int[5];
		numItems = 0;
	}
	
	//Methods in alphabetical order
	public void add(int d) {
		if (isFull()) {grow();}
		
		data[numItems] = d;
		numItems++;
	}
	
	public void add(int pos, int d) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		if (isFull()) {grow();}
		
		for (int i = data.length - 1; i > pos; i--) {data[i] = data[i - 1];}
		data[pos] = d;
		numItems++;
	}
	
	public boolean contains(int d) {
		for (int i = 0; i < data.length; i++) {if (data[i] == d) {return true;}}
		
		return false;
	}
	
	/*public int find(int d) { //Return d itself
		for (int i = 0; i < data.length; i++) {if (data[i] == d) {return d;}}
		
		return d + 1;
	}*/
	
	public int find(int d) {
		for (int i = 0; i < data.length; i++) {if (data[i] == d) {return i;}}
		
		return -1;
	}
	
	public void fremove(int d) {remove(find(d));}
	
	public int get(int pos) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		return data[pos];
	}
	
	public void grow() {data = Arrays.copyOf(data, data.length + (data.length / 2));} //Should this be private? Don't want anyone to call grow() at whim and use up all the memory.
	
	public boolean isFull() {return numItems >= data.length;}
	
	private boolean outOfBounds(int pos) {return ((pos < 0) || (pos >= data.length));}
	
	public void remove(int pos) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		for (int i = pos; i <= data.length - 2; i++) {data[i] = data[i + 1];}
		data[data.length - 1] = 0;
		//Note that the array does not shrink.
		numItems--;
	}
	
	public void set(int pos, int d) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		data[pos] = d;
	}
	
	public int size() {return data.length;}
	
	public int[] toArray() {return data;}
	
	public String toString() {return Arrays.toString(data) + " : " + numItems;}
}
