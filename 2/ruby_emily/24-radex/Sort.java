import java.io.*;
import java.util.*;

public class Sort{
    private ArrayList<Integer>[] buckets=new ArrayList[10];
    private int[] a;

    public Sort(int n){
	Random r=new Random();
	a=new int[n];
	for (int i=0;i<10;i++){
	    buckets[i]=new ArrayList<Integer>();
	}
	for (int i=0;i<n;i++){
	    a[i]=r.nextInt(8999)+1000;
	}
    }
    
    public String toString(){
	return Arrays.toString(a);
    }

    public String printBuckets() {
        return Arrays.toString(buckets);
    }
   
    public void Radex(){
	int[] temp=new int[a.length];
	int value;
	int n=0;
	while (n<4){
	    for (int i=0;i<a.length;i++){
		value=(int)((a[i]/(Math.pow(10,n))) % 10);
		buckets[value].add(a[i]);

	    }
	    //System.out.println(printBuckets());
	    int k=0;
	    while (k<temp.length){
		for (int i=0;i<buckets.length;i++){
		    if (buckets[i].size()!=0){
			for (int j=0;j<buckets[i].size();j++){
			    temp[k]=buckets[i].get(j);
			    k=k+1;
			}
		    }
		}
	    }
	  
	    a=temp;
	    for (int i=0;i<buckets.length;i++){
		buckets[i]=new ArrayList<Integer>();
	    }
	    n=n+1;  
	}
	//System.out.println(this);
    }

    
}
//worked on in class with Aida Piccato
