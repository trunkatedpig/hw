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
	
	public boolean contains(int item) {
		for (int i = 0; i < items.length; i++) {if (items[i] == item) {return true;}}
		
		return false;
	}
	
	public int find(int item) {
		for (int i = 0; i < items.length; i++) {if (items[i] == item) {return i;}}
		
		return -1;
	}
	
	public int get(int index) {return items[index];}
	
	private boolean outOfBounds(int index) {return ((index < 0) || (index >= items.length));}
	
	public void remove(int item) {removeIndex(find(item));}
	
	public void removeIndex(int index) {
		if (outOfBounds(index)) {throw new ArrayIndexOutOfBoundsException(index);}
		
		for (int i = index; i <= items.length - 2; i++) {items[i] = items[i + 1];}
		
		items = Arrays.copyOfRange(items, 0, items.length - 1);
	}
	
	public void set(int index, int item) {
		if (outOfBounds(index)) {throw new ArrayIndexOutOfBoundsException(index);}
		
		items[index] = item;
	}
	
	public int size() {return items.length;}
	
	public myListCustom subList(int start, int end) {
		if (outOfBounds(start)) {throw new ArrayIndexOutOfBoundsException(start);}
		if (outOfBounds(end - 1)) {throw new ArrayIndexOutOfBoundsException(end);} //end or end - 1?
		if (start > end) {throw new IllegalArgumentException("End index must be greater than or equal to the start index.");}
		
		return new myListCustom(Arrays.copyOfRange(items, start, end));
	}
	
	public int[] toArray() {return items;}
	
	public String toString() {return Arrays.toString(items);}
}