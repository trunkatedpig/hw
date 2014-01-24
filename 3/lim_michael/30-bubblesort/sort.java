import java.io.*;
import java.util.*;

public class sort {
    private int[] ran = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
    private int compare, swap;

    public void generate() {
	Random r = new Random();
	for(int i = 0; i < 10; i++) {
 	    ran[i] = r.nextInt(9999);
	}
    }

    public String toString() {
	String s = "[ ";
	for(int i =0; i< ran.length; i++) {
	    s = s + ran[i] + " ";
	}
	s = s + "]";
	return s;
    }

    public void radixSort(){
	for(int i = 0; i < 4; i++) {
	    for(int newi = 0; newi<10; newi++){
		buckets[newi] = new ArrayList();
	    }

	    for(int j = 0; j <10; j++) {
		int n = ran[j]/((int)(Math.pow(10,i)))%10;
		buckets[n].add(ran[j]);
	    }
	    
	    int herp = 0;
	    for(int k = 0; k<10; k++) {
		for(int l = 0; l<buckets[k].size(); l++) {
		    int z = (Integer)(buckets[k].get(l));
		    ran[herp] = z;
		    herp++;
		}
	    }
	    
	}
    }

    public void bsort(int[] a){
	compare = 0;
	swap = 0;
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a.length-1;j++){
		compare++;
		if(a[j]>a[j+1]){
		    swap++;
		    int n = a[j];
		    a[j] = a[j+1];
		    a[j+1] = n;
		}
	    }
	}
    }

    public void insertionSort(int[] a){
	compare = 0;
	swap = 0;
        for (int i=1;i<a.length;i++) {
            int temp = a[i];
	    compare++;
            for(int j=i;j>0 && a[j]<a[j-1];j--) {
                compare++;
                a[j] = a[j-1];
                a[j-1] = temp;
		swap+=2;
            }
        }
    }
    
    public void selectionSort(int[] a){
	compare = 0;
	swap = 0;
	for (int i=0;i<a.length-1;i++) {
            int min = i;
            for (int j=i;j<a.length;j++) {
                compare++;
                if (a[j]<a[min]) {
                    min=j;
                }
            }
            for (int k=min;k>i;k--) {
                a[k]=a[k-1];
		swap++;
	    }
            a[i]=a[min];    
        }
    }

    
    public static void main(String[] args) {
	sort s = new sort();
	s.generate();
	System.out.println("Before " + s);
	s.radixSort();
	System.out.println("After " + s);
	
	s.generate();
	System.out.println("Before " + s);
	s.bsort(s.ran);
	System.out.println("After " + s);
	
	s.generate();
	System.out.println("Before " + s);
	s.insertionSort(s.ran);
	System.out.println("After " + s);
	
	s.generate();
	System.out.println("Before " + s);
	s.selectionSort(s.ran);
	System.out.println("After " + s);
    }
} 
