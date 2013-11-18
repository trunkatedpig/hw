import java.util.*;

public class myList {
	//myList for a list of integers
	private int[] items;
	
	public myList() {items = new int[0];}
	public myList(int item) {items = new int[] {item};}
	
	public void add(int item) {
		items = Arrays.copyOf(items, items.length + 1);
		items[items.length - 1] = item;
	}
	
	public int get(int index) {return items[index];}
	
	public int[] toArray() {return items;}
	
	public String toString() {return Arrays.toString(items);}
}