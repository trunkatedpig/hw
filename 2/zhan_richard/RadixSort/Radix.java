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
	for (int i = 0; i < 10; i ++)
	    bucket[i] = new ArrayList();
	for (int n = 0; n < 4); n++){
	for (int i = 0; i < 10; i++){
	    for (int j = 0; j < 10; j++){
		if ((data[i]/(10^n))%10 == j)
		    bucket[j]=bucket.add(data[i]);
    }

} 