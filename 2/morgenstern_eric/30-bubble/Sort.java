import java.io.*;
import java.util.*;

public class Sort{
    public void bSort(int[] a){
	int temp=0;
	int numSorts=0;
	int sortsPerFor=0;
	int numIfs=0;
	long time;
	long start = System.currentTimeMillis();
	for(int j=0;j<a.length-1;j++){
	    for(int i=0;i<a.length-1;i++){
		if(a[i]>a[i+1]){
		    numIfs=numIfs+1;
		    numSorts=numSorts+1;
		    sortsPerFor=sortsPerFor+1;
		    temp=a[i];
		    a[i]=a[i+1];
		    a[i+1]=temp;
		}
	    }
	    if(sortsPerFor==0){
		System.out.println( Arrays.toString(a));
		time = System.currentTimeMillis()-start;
		System.out.println(time);
	    }
	    sortsPerFor=0;
	}
	System.out.println( Arrays.toString(a));
	time = System.currentTimeMillis()-start;
	System.out.println(time);
    }
    public void iSort(int[] a){
	int numSorts=0;
	int numIfs=0;
	int temp=0;
	long time;
	long start = System.currentTimeMillis();
	for(int i=1;i<a.length;i++){
	    temp=a[i];
	    for(int j=i;j>0;j--){
		if(a[j]<a[j-1]){
		    a[j]=a[j-1];
		    a[j-1]=temp;
		}
		else
		    break;
	    }
	    
	}
	System.out.println( Arrays.toString(a));
	time = System.currentTimeMillis()-start;
	System.out.println(time);
    }
    public void sSort(int[] a){
	int index = 0;
	int temp=0;
	int numSorts=0;
	int numIfs=0;
	long time;
	long start = System.currentTimeMillis();
	for(int i=0;i<a.length;i++){
	    index=i;
	    temp=a[i];
	    for(int j=i;j<a.length;j++){
		if(temp>a[j]){
		    index=j;
		    temp=a[j];
		    numIfs++;
		}
	    }
	    a[index]=a[i];
	    numSorts++;
	}
	System.out.println(Arrays.toString(a));
	time = System.currentTimeMillis()-start;
	System.out.println(time);
    }
    public static void main(String[] args){
	Sort b = new Sort();
	Random r = new Random();
	int[] randstuff=new int[10000];
	for(int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(89999)+10000;
	b.iSort(randstuff);
    }
}
