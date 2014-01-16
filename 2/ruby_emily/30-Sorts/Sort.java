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

    public void bsort(){
	//	a=this.a;
	int swaps=0;
	int k=0;
	while (k<a.length){
	    for (int i=0;i<a.length-1;i++){
		if (a[i]>a[i+1]){
		    int b=a[i+1];
		    a[i+1]=a[i];
		    a[i]=b;
		    swaps=swaps+1;
		}
	    }
	    k=k+1;
	}
    }

    public int findMin(int[]b, int start){
	int min=start;
	for (int i=start;i<b.length;i++){
	    if (b[i]<b[min]){
		min=i;
	    }
	}
	return min;
    }
    
    public void sSort(){
	int n=0;
	while (n<a.length){
	    for (int i=n;i<a.length;i++){
		int k= findMin(a,i);
		if (a[i]>a[k]){
		    int r=a[k];
		    a[k]=a[i];
		    a[i]=r;
		}
	    }
	    n=n+1;
	}
    }

    public void iSort(){
	int temp=0;
	for (int i=0;i<a.length;i++){
	    temp=a[i];
	    for (int j=0;j<a.length;j++){
		if (a[j]>a[j+1]){
		    a[j+1]=a[j];
		    a[j+1]=temp
		}
	    }
	}
    }
    

    public static void main(String[] args){
	Sort s= new Sort(10);
	System.out.println(s);
	s.sSort();
	System.out.println(s);
	/*	System.out.println(s);
	System.out.println("-------------------------");

       	long start=System.currentTimeMillis();
	s.bsort();
	long end=System.currentTimeMillis();
	System.out.println("Bubble Sort: "+(end-start));
	//	System.out.println(s);

	System.out.println("-------------------------");

	start=System.currentTimeMillis();
	s.Radex();
	end=System.currentTimeMillis();
	System.out.println("Radex Sort: "+(end-start));
	*/

    }

    
}
