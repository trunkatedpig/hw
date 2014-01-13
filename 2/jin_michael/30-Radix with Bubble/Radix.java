import java.util.*;
import java.io.*;

public class Radix{
    private int[] data;
    private double[] data2;
    
    public Radix(int n){
	Random r = new Random();
	double r1;
	data=new int[n];
	for (int i=0;i<n;i++){
	    r1 = r.nextDouble();
	    data[i]=(int)(r1*1000);
	}

	data2=new double[n];
	for (int i=0;i<n;i++){
	    r1 = r.nextDouble();
	    data2[i]=(r1*1000);
	}
    }
    

    public String toString(){
	String s=Arrays.toString(data);
	return s;   
    }
    
    
    public void sort(){
	for (int n = 0; n < 3; n++){	    
	    ArrayList[] bucket = new ArrayList[10];
	    for (int i = 0; i < 10; i++)
		bucket[i] = new ArrayList();
	    
	    for(int i=0;i<data.length;i++){
		int j=(int)(data[i]/( Math.pow(10, n)))%10;
		bucket[j].add(data[i]);}
	    int place=0;
	    for (int i=0;i<10;i++){
		for (int w=0;w<bucket[i].size();w++){
		    data[place]=(Integer)(bucket[i].get(w));
		    place=place+1;}}
	}
    }
    
    public double[] bsort(){
	int compare=0;
	int swap=0;
	for (int i=data2.length-1;i>=0;i--){
	    double[] b=data2.clone();
	    for (int n=0;n<i;n++){
		compare+=1;
		if (data2[n]>data2[n+1]){
		    swap+=1;
		    double[] q={data2[n]};
		    data2[n]=data2[n+1];
		    data2[n+1]=q[0];
		}
	    }
	    if (Arrays.equals(b,data2)){
		System.out.println(compare);
		System.out.println(swap);		
		return data2;
	    }
	}
	System.out.println(compare);
	System.out.println(swap);
	return data2;
    }
    
    public static void main(String[] args){
	Radix a = new Radix(10);
	a.bsort();
	System.out.println(Arrays.toString(a.data2));
    }
}
