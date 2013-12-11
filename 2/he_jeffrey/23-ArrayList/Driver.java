import java.util.*;

//it took significantly longer to add at the beginning than at the end and it took significantly longer to remove from the beginning.
public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> q = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
	    q.add(i);
	}
	System.out.println(q);
	System.out.println(reverse(q));
    }

    public static ArrayList reverse(ArrayList b) {
	for (int i = 0; i < b.size()/2; i ++) {
	    Object temp = new Object();
	    temp = b.get(i);
	    b.set(i,b.get(b.size() - 1 - i));
	    b.set(b.size() - 1 - i, temp);
	}
	return b;
    }
}
