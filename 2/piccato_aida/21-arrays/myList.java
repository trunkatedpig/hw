public class myList {
    private int[] data;
    private int numItems;

    public myList() {
	data = new int[5];
	numItems = 0;
    }

    public add(int d) {
	if (numItems >= data.length) {
	    int[] tempArray = new int[data.length + data.length/2];
	    for (int i = 0; i < data.length; i++) {
		tempArray[i] = data[i];
	    }
	}
	
	}
    }
}