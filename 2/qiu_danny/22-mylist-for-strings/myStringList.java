import java.util.*;

public class myStringList {

    private String[] data;
    private int numItems = 0;

    public myStringList() {
        data = new String[5];
    }

    public myStringList(int n) {
        data = new String[n];
    }

    public myStringList(int n, boolean random) {
        data = new String[n];
        if (random) {
            for (int i=0; i<data.length; i++) {
                data[i] = UUID.randomUUID().toString(); // Got this off Stack Overflow
            }
            numItems = data.length;
        }
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
        String[] tmpArray = new String[data.length + data.length/2];
        for (int i=0; i<data.length; i++)
            tmpArray[i] = data[i];
        data = tmpArray;
    }

    public void add(String s) {
        if (isFull()) {
            grow();
        }
        data[numItems] = s;
        numItems++;
    }
    
    public void add(int pos, String s) {
        if (badPosition(pos))
            return;
        if (isFull()) {
            String[] tmpArray = new String[data.length + 1];
            int offset = 0;
            for (int i=0; i<data.length; i++) {
                if (i == pos) {
                    tmpArray[i] = s;
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
            data[pos] = s;
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
        data[numItems - 1] = null;
        numItems--;
    }

    public String get(int pos) {
        if (badPosition(pos))
            return "";
        return data[pos];
    }

    public void set(int pos, String s) {
        if (badPosition(pos))
            return;
        data[pos] = s;
    }

    public int size() {
        return numItems;
    }

    public String find(String n) {
        for (int i=0; i<data.length; i++) {
            if (n == data[i])
                return data[i];
        }
        return "Nothing was found";
    }

    public void fRemove(String n) {
        for (int i=0; i<data.length; i++) {
            if (n == data[i]) {
                remove(i);
                break;
            }
        }
    }
}
