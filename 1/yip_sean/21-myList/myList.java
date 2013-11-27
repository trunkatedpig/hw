import java.util.*;

public class myList {
	//myList for a list of integers
	private int[] items;
	
	public myList() {items = new int[0];}
	public myList(int item) {items = new int[] {item};}
	public myList(int[] items) {this.items = items;}
	
	public void add(int item) {
		items = Arrays.copyOf(items, items.length + 1);
		items[items.length - 1] = item;
	}
	
	public void add(int index, int item) {
		items = Arrays.copyOf(items, items.length + 1);
		for (i = items.length - 1; i >= index; i--) {items[i] = items[i - 1];}
		items[index] = item;
	}
	
	public int get(int index) {return items[index];}
	
	public int[] toArray() {return items;}
	
	public String toString() {return Arrays.toString(items);}
}
