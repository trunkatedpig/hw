import java.util.*;

public class myList {

    private int[] data;
    private int numItems = 0;
    Random r = new Random();

    public myList() {
        data = new int[5];
    }

    public myList(int n) {
        data = new int[n];
    }

    public myList(int n, int m) {
        data = new int[n];
        for (int i=0; i<data.length; i++) {
            data[i] = r.nextInt(m);
        }
        numItems = data.length;
    }

    public String toString() {
        String s = Arrays.toString(data) + " : " + numItems;
        return s;
    }

    public boolean isFull() {
        return numItems >= data.length;
    }

    private boolean badPosition(int pos) {
        if (data.length <= pos) {
            System.out.println("Your input position is out of index!");
            return true;
        }
        else
            return false;
    }

    public void grow() {
        System.out.println("Growing from "+data.length+" to "+data.length*1.5);
        // "grow" the array by creating a new one and copying over
        int[] tmpArray = new int[data.length + data.length/2];
        for (int i=0; i<data.length; i++)
            tmpArray[i] = data[i];
        data = tmpArray;
    }

    public void add(int d) {
        if (isFull()) {
            grow();
        }
        data[numItems] = d;
        numItems++;
    }
    
    public void add(int pos, int d) {
        if (badPosition(pos))
            return;
        if (isFull()) {
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
            numItems++;
        }
        else {
            for (int i=numItems; i>pos; i--) {
                data[pos] = data[pos - 1];
            }
            data[pos] = d;
        }
    }

    public void remove(int pos) {
        if (badPosition(pos))
            return;
        else if (numItems <= 0) {
            System.out.println("There is nothing you can remove!");
            return;
        }
        for (int i=pos; i<numItems-1; i++) {
            data[i] = data[i + 1];
        }
        data[numItems - 1] = 0;
        numItems--;
    }

    public int get(int pos) {
        if (badPosition(pos))
            return 0;
        return data[pos];
    }

    public void set(int pos, int d) {
        if (badPosition(pos))
            return;
        data[pos] = d;
    }

    public int size() {
        return numItems;
    }

    public int find(int n) {
        for (int i=0; i<data.length; i++) {
            if (n == data[i])
                return data[i];
        }
        return -1;
    }

    public void fRemove(int n) {
        for (int i=0; i<data.length; i++) {
            if (n == data[i]) {
                remove(i);
                break;
            }
        }
    }
}
