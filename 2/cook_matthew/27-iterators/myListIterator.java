import java.util.*;
public class myListIterator implements Iterator<Integer> {
    public boolean hasNext() {
	return false;
    }
    
    public Integer next() {
	return new Integer(0);
    }

    public void remove() {
    }

}
