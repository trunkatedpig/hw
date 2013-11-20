import java.util.*;

public class myListCustom {
	//myList for a list of integers
	private int[] items;
	
	public myListCustom() {items = new int[0];}
	public myListCustom(int item) {items = new int[] {item};}
	public myListCustom(int[] items) {this.items = items;}
	
	//Methods in alphabetical order
	public void add(int item) {
		items = Arrays.copyOf(items, items.length + 1);
		items[items.length - 1] = item;
	}
	
	public void add(int index, int item) {
		if (outOfBounds(index)) {throw new ArrayIndexOutOfBoundsException(index);}
		
		items = Arrays.copyOf(items, items.length + 1);
		for (int i = items.length - 1; i > index; i--) {items[i] = items[i - 1];}
		items[index] = item;
	}
	
	public int get(int index) {return items[index];}
	
	private boolean outOfBounds(int index) {return ((index < 0) || (index >= items.length));}
	
	public void remove(int index) {
		if (outOfBounds(index)) {throw new ArrayIndexOutOfBoundsException(index);}
		
		for (int i = index; i <= items.length - 2; i++) {items[i] = items[i + 1];}
		
		items = Arrays.copyOfRange(items, 0, items.length - 1);
	}
	
	public void set(int index, int item) {
		if (outOfBounds(index)) {throw new ArrayIndexOutOfBoundsException(index);}
		
		items[index] = item;
	}
	
	public int size() {return items.length;}
	
	public int[] toArray() {return items;}
	
	public String toString() {return Arrays.toString(items);}
}