import java.io.*;
import java.util.*;

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
                if (isFull()) {
                        int[] ret = new int[data.length + 1];
                        for (int i = 0; i < numItems + 1; i++) {
                                if (i < pos) {
                                        ret[i] = data[i];
                                } else if (i > pos){
                                        System.out.println(i);
                                        ret[i] = data[i-1];
                                } else{
                                        ret[pos] = d;
                                }
                        }
                        data = ret;
                } else {
                        for (int i = numItems; i > pos; i--) {
                                data[i] = data[i-1];
                        }
                        data[pos] = d;
                
                }
                numItems++;

        }
        
        public void remove(int pos) {
                for (int i=pos; i<numItems-1; i++) {
                        data[i] = data[i + 1];
                }
                data[numItems - 1] = 0;
                numItems--;
        }

        public int get(int pos) {
                return data[pos];
        }

        public void set(int pos, int d) {
                data[pos] = d;
        }

        public int size() {
                return numItems;
        }
        
        public String toString() {
                String s = Arrays.toString(data)+" : "+numItems;
                return s;
        }
        
        public int find(int n) {
                for (int i = 0; i < numItems; i++) {
                        if(data[i] == n) {
                                return data[i];
                        }
                }
                return 0;
        }
        
        public void fremove(int n) {
                for (int i = 0; i < numItems; i++) {
                        if (data[i] == n) {
                                remove(i);
                        }
                }
        }
}

/*Worked with Jeffrey*/
