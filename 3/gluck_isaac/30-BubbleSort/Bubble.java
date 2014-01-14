import java.util.*;
import java.io.*;

public class Bubble {
    private ArrayList[] buckets = new ArrayList[10];
    public int[] ran = new int[10];
    private int compares,swaps = 0;

    public void generate(){
	Random r = new Random();
	for (int i=0;i<10;i++){
	    ran[i] = r.nextInt(9999);
	}
    }
    
    public void redixSort(){
	for (int i=0;i<4;i++){
	    for (int p=0;p<10;p++)
		buckets[p]=new ArrayList();
	    
	    for (int j=0;j<10;j++){
		int n = ran[j]/((int)(Math.pow(10,i)))%10;
		buckets[n].add(ran[j]);
	    }
	    
	    int x=0;
	    for (int k=0;k<10;k++){
		for (int m=0;m<buckets[k].size();m++){
		    ran[x] =(Integer)(buckets[k].get(m));
		    x++;
		}
	    }
	}
    }

    public void bSort(int[] toSort){
	for(int i=0;i<toSort.length;i++){
	    for(int n=0;n<toSort.length-1;n++){
		compares++;
		if(toSort[n]>toSort[n+1]){
		    swaps++;
		    int tmp = toSort[n];
		    toSort[n] = toSort[n+1];
		    toSort[n+1]=tmp;
		}
	    }
	}
    }
    
    public String toString(){
	String r = "";
	for (int i=0;i<ran.length;i++){
	    if (i!=ran.length-1)
		r+=ran[i] + ", ";
	    else
		r+=ran[i];
	}
	return r;
    }

    public static void main(String[] args){
	Bubble b = new Bubble();
	b.generate();
	System.out.println(b);
	b.bSort(b.ran);
	System.out.println(b);
    }
}
