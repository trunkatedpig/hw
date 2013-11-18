import java.util.Arrays;


public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
    	data = new int[5];
    	numItems=0;
    }

    public boolean isFull() {
    	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public void add(int d) {
    	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
    	String s = Arrays.toString(data)+" : "+numItems;
    	return s;
    }
	
    public void add(int pos, int d) {
		// to be completed by you
		// inserts the value d at location (index) pos)
		// recall the algorithm we developed in calss:
		// 1. Grow if needed
		// 2. shift everything past the insertion point down
		// 3. add the new item
		// 4. numitems++
	}

    public void remove(int pos) {
		int[] result = new int[data.length];
		for(int i=0;i<pos;i++){
			result[i]=data[i];
		}
		for(int i=pos;i<result.length;i++){
			if(i==(result.length-1)){
				result[i]=0;
				break;
			}
			result[i]=data[i+1];
		}
		data = result;
		numItems--;
		
	}
	public int size() {
		return numItems;
	}
	public int get(int pos) {
		return data[pos];
	}
	public void set(int pos, int d) {
		data[pos] = d;
	}
}