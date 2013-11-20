import java.io.*;
import java.util.*;
public class myStringList {

    private String[] data;
    private int numItems;
    
    public myStringList()
    {
        data = new String[10];
        numItems=0;
    }
    
    public void add(String d) {

        if (numItems>=data.length) {
            System.out.println("Growing");
            String[] tmpArray = new String[data.length+(data.length/2)];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }

        
        // then add
        data[numItems]=d;

        numItems=numItems+1;
    }
    
    public String toString() {
        String s =Arrays.toString(data)+" --- " +numItems;
        return s;
    }

    public void insert (int pos, String d) {
        String[] placeholder = new String[data.length + 1];
        for(int i = 0; i < placeholder.length; i = i + 1) {
            if (i < pos){
                placeholder[i] = data[i];
            }
            else if (i > pos){
                placeholder[i] = data [i-1];
                    }
            else if (i == pos){
                placeholder[i] = d;
        }
            
    }
        numItems = numItems + 1;
        System.out.println (placeholder.length);
            data=placeholder;

    }

    public void remove (int pos){
        String[] placeholder = new String[data.length-1];
        for (int i = 0; i < placeholder.length; i = i + 1){
            if (i<pos) {
                placeholder[i] = data[i];
            }
        
	    else {
		placeholder [i] = data [i+1];
            }
        }
	data = placeholder;
        numItems = numItems - 1;
    }

    public int size (){
	return numItems;
    }

    public String get (int pos){
	return data[pos];
    }

    public void set (int pos, String d){
	data[pos] = d;
    }
    public String find (String d){
        for (int i = 0; i < data.length; i++){
            if (data[i].equals(d)){
                return d;
            }
        }
        return "Invalid value";
    }
    public void fremove(String d){
        boolean t = true;
        int i = 0;
	while ( i<data.length && t){
            if (data[i].equals(d)){
                remove(i);
                t = false;
            }
            i = i + 1;
	}        
    }
}
