import java.util.*;

public class myList {

    private int[] data;
    private int numItems = 0;

    public myList() {
        data = new int[5];
    }

    public myList(int n) {
        data = new int[n];
    }

    public String toString() {
        String s = Arrays.toString(data) + " : " + numItems;
        return s;
    }

    public void add(int d) {
        if (numItems >= data.length) {
            System.out.println("Growing from "+data.length+" to "+data.length*1.5);
            // "grow" the array by creating a new one and copying over
            int[] tmpArray = new int[data.length + data.length/2];
            for (int i=0; i<data.length; i++)
                tmpArray[i] = data[i];
            data = tmpArray;
        }
        data[numItems] = d;
        numItems = numItems + 1;
    }
    
    public void insert(int pos, int d) {
        int[] tmpArray = new int[data.length + 1];
        int offset = 0;
        for (int i=0; i<data.length; i++) {
            if (i == pos) {
                tmpArray[i] = d;
                offset += 1;
            }
            else {
                tmpArray[i + offset] = data[i];
            }
        }
        data = tmpArray;
        numItems += 1;
    }
	
}
