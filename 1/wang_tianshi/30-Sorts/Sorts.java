import java.io.*;
import java.util.*;

public class Sorts { 

    public double[] sort(double[] a){
        ArrayList[] buckets = new ArrayList[a.length];
        for (int i = 0; i<a.length; i++){
            buckets[i] = new ArrayList();
        }
        for (int n = 0; n<3; n++){
            for (int i = 0; i <a.length; i++){
                buckets[(int)(a[i]/Math.pow(10,n))%10].add(a[i]);
            }
            int x = 0;
            for (int j = 0; j <a.length; j++){
                for (int k = 0; k <buckets[j].size(); k++){
                    a[x] = (Double)buckets[j].get(k);
                    x = x +1;
                }
            }
            for (int b = 0; b <buckets.length; b++){
                buckets[b] = new ArrayList();
            }
        }   
        return a;
    }

    public double[] bsort(double[] a) {
        int comparisons = 0;
        int swaps = 0;
        for (int n = 0; n<a.length; n++ ) {
            for (int x = 0; x < a.length -1 ; x++ ) {
                comparisons = comparisons + 1;
                if (a[x] > a[x+1]) {
                    swaps = swaps + 1;
                    double temp = a[x];
                    a[x] = a[x+1];
                    a[x+1] = temp;
                }
            }
        }
        System.out.println("swaps: "+swaps +" comparisons: "+ comparisons);
	return a;
    }
    
    public double[] ssort(double[] a){
	int comparisons=0;
	int swaps = 0;
	int least;
	double temp;
	for (int i=0; i<a.length -1;i++){
	    least=i;
	    for (int j=i;j<a.length;j++){
		comparisons++;
		if (a[least]>a[j])
		    least=j;
	    }
	    temp = a[i];
	    a[i]=a[least];
	    a[least]=temp;
	    swaps++;
	}
	System.out.println("swaps: "+swaps +" comparisons: "+ comparisons);
        return a;
    }

    public double[] isort(double[] a){
	int comparisons=0;
	int swaps = 0;
	int least;
	double temp;
	for (int i=1; i<=a.length;i++){
	    least=i;
	    for (int j=i;j>0 && a[j]<a[j-1];j--){
		comparisons++;
		swaps++;
		a[j]=a[j-1];
	    }
	    temp=a[least];
	    swaps+=2;
	}
	swaps=swaps/3;
	System.out.println("swaps: "+swaps +" comparisons: "+ comparisons);
        return a;
    }
}
