import java.util.*;

public class myStringList {
	private String[] data;
	private int numItems;
	
	public myStringList() {
		data = new String[5];
		numItems = 0;
	}
	
	//Methods in alphabetical order
	public void add(String d) {
		if (isFull()) {grow();}
		
		data[numItems] = d;
		numItems++;
	}
	
	public void add(int pos, String d) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		if (isFull()) {grow();}
		
		for (int i = data.length - 1; i > pos; i--) {data[i] = data[i - 1];}
		data[pos] = d;
		numItems++;
	}
	
	public boolean contains(String d) {
		for (int i = 0; i < data.length; i++) {if (data[i].equals(d)) {return true;}}
		
		return false;
	}	
		
	public int find(String d) {
		for (int i = 0; i < data.length; i++) {if (data[i].equals(d)) {return i;}}
		
		return -1;
	}
	
	public void fremove(String d) {remove(find(d));}
	
	public String get(int pos) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		return data[pos];
	}
	
	public void grow() {data = Arrays.copyOf(data, data.length + (data.length / 2));} //Should this be private? Don't want anyone to call grow() at whim and use up all the memory.
	
	public boolean isFull() {return numItems >= data.length;}
	
	private boolean outOfBounds(int pos) {return ((pos < 0) || (pos >= data.length));}
	
	public void remove(int pos) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		for (int i = pos; i <= data.length - 2; i++) {data[i] = data[i + 1];}
		data[data.length - 1] = "";
		//Note that the array does not shrink.
		numItems--;
	}
	
	public void set(int pos, String d) {
		if (outOfBounds(pos)) {throw new ArrayIndexOutOfBoundsException(pos);}
		
		data[pos] = d;
	}
	
	public int size() {return data.length;}
	
	public String[] toArray() {return data;}
	
	public String toString() {return Arrays.toString(data) + " : " + numItems;}
}
