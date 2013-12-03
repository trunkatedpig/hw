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
	ArrayList[] bucket = new ArrayList[10];
	int k =0;
        for (int i = 0; i < 10; i++)
	    bucket[i] = new ArrayList();
	for (int n = 0; n < 4; n++){
	    for (int j = 0; j < 10; j++){
		for (int i = 0; i < 10; i++){
		    if (((data[i]/Math.pow(10,n))%10) == j)
			bucket[j].add(data[i]);
		}
	    }
	    
	    for (int deep = 0; deep < 10; deep++){
		for (int verydeep = 0; verydeep < bucket[deep].size(); verydeep++){
		    data[k] =(Integer) bucket[deep].get(verydeep);
		    k++;

		    System.out.println(Arrays.toString(data));
		}
	    }
	    k=0;


	    System.out.println(Arrays.toString(bucket));

	    for (int i = 0; i < 10; i++)
		bucket[i].clear();
	    System.out.println(Arrays.toString(bucket));
	}
	
    }

} 
