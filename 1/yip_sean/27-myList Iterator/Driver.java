import java.util.*;

public class Driver {
	public static void main(String[] args) {
		myList L = new myList();
		
		for (int i = 1; i <= 5; i++) {L.add(i);}
		
		Iterator iterator = L.iterator();
		
		while (iterator.hasNext()) {System.out.println(iterator.next());}
	}
}