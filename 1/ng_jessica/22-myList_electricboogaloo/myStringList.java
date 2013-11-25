public class myList2 {
    private String[] data;
    private int numItems;
    
    public myList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	// "grow" the array by creating a new one and copying over
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
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
	
    public void add(int pos, String d) {
	if (isFull()) {
	    grow();
	}
	String a [] = new String [data.length];
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

    public void remove(String pos) {
	String a []= new String [data.length - 1];
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

public String get(int pos) {
    String a = "";
    a = data[pos];
    return a;
}

public void set(int pos, String d) {
    data [pos] = d;
}

public String find(int d){
    for (int i=0; i<numItems; i++){
	if (data[i] == d)
	    return data[i];
    }
    return "none";
}

public void fremove(String d){
    for (int i=0; i<numItems; i++){
	if (data[i] == d){
	    remove(i);
	    i = numItems+1;
	}
    }
}

}
