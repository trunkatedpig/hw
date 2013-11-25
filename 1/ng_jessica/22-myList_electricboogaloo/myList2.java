public class myList2 {
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
	if (isFull()) {
	    grow();
	}
	int a [] = new int [data.length];
	for (int i = 0; i <= data.length; i++) {
	    if ( i == pos ) {
		a [pos] = d;
	    }
	    else {
		a[i] = data [i];
	    }
	}
	return a;
    }

    public void remove(int pos) {
	int a []= new int [data.length - 1];
	int i = data.length - 1;
	while ( i >= 0 ) {
	    if ( i == pos ) {
		i = i - 1;
	    }
	    else {
		a [i] = data [i];
		i = i -1;
	    }
	}
	return a;
    }
	}
	public int size() {
	    int a = 0;
	    a = data.length;
	    return a; 
	}

	public int get(int pos) {
	    int a = 0;
	    a = data[pos];
	    return a;
	}

	public int set(int pos, int d) {
	    data [pos] = d;
	}

}
