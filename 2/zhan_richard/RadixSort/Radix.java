import java.util.*;
import java.io.*;
public class Radix{

    private int[] data;
    
    public Radix(int n){
	Random r = new Random();
	double r1;
	data=new int[n];
	for (int i=0;i<n;i++){
	    r1 = r.nextDouble();
	    data[i]=(int)(r1*10000);
	}
    }
    public String toString(){
	String s=Arrays.toString(data);
	return s;   
    }
    public void sort(){
	int k;
	ArrayList[] bucket = new ArrayList[10];
	for (int i = 0; i < 10; i++)
	    bucket[i] = new ArrayList();
	for (int n = 0; n < /*4*/1; n++){
	    for (int j = 0; j < 10; j++){
		for (int i = 0; i < 10; i++){
		    if (((data[i]/1/*(10^n)*/)%10) == j)
			bucket[j].add(data[i]);
		}
	    }
	}
	System.out.println(Arrays.toString(bucket));
	/* k = 0;
	int putin = 0;
	while (k < data.length){
	    for (int i = 0 ; i < bucket[k].size();i++){
		data[putin]=bucket[k].indexOf(i);
		putin++;
	    }
	    k++;
	    
	}
	*/
    }

} 
