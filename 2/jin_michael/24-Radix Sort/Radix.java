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
	    data[i]=(int)(r1*1000);
	}}


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
    
}
