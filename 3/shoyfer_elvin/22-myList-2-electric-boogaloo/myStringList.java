import java.io.*;
import java.util.*;

public class myStringList {
   private String[] data;
   private int numItems;
   private Random r1 = new Random();

   public myStringList() {
    	data = new String[5];
		  numItems = 0;
   }


    public boolean isFull() {
        return numItems >= data.length;
    }

    public void grow() {
        String[] tmpArray = new String[data.length+data.length/2];
        for (int i=0;i<data.length;i++) {
            tmpArray[i]=data[i];
        }
        data = tmpArray;
    }

    public void add(String d) {
        if (isFull()) {
            grow();
    }

        data[numItems] = d;
        numItems=numItems+1;
    }


    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public void insert(int pos, String d) {
    	String[] newArray = new String[data.length + 1];
    	int j = 0; // offset of index
    	for(int i = 0; i < data.length; i++) { // i is in terms of position in data, not newArray
    		if ((!(i == pos)) || ((j == 1) && (i == pos))) { // If we haven't arrived at the position of insertion yet OR to re-allign immediately following the shift in assignment once insertion was completed
    			newArray[i+j] = data[i];
    		}
    		if ((j != 1) && (i == pos)) {
    			newArray[i] = d;
    			j = 1; // position in newArray is now 1 greater than position in data; j represents offset 
    			i--; // this all occurs in terms of position in data; without doing i--, we will have skipped an element in data 
    		}

    	}
    	numItems = numItems + 1;
    	data = newArray;

	}

	public String remove(int pos) {
		String[] newArray = new String[data.length - 1];
		String removedString = "";
		int j = 0; // offset of index
		for(int i = 0; i < data.length; i++) {
			if (!(i == pos)) {
				newArray[i+j] = data[i];
			} 

			if ((j != -1) && (i == pos)) {
				removedString = data[i];
				j = -1; // offset parallel assignment of data and newArray by 1 (data leads)
			}
		}
		data = newArray;
		numItems = numItems - 1;
		return removedString;
	}

	public int size() {
		return numItems;
	}

	public String get(int pos) {
		return data[pos];
	}

	public String set(int pos, String d) {
    String ans = data[pos];
		if (pos <= data.length) {
			data[pos] = d;
		}
    return ans;
	}

  public String find(String d) {
    for(int i = 0; i < data.length; i++) {
      if (data[i] == d) {
        return data[i];
      }
    }
    return "";
  }

  public String fremove(String d) {
    if (find(d) == d) {
      for(int i = 0; i < data.length; i++) {
        if (data[i] == d) {
          remove(i);
          return d;
        }
      }
    }
    return "";
  }

}