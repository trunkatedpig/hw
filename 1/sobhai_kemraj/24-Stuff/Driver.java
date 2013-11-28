import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	int[] numbs = new int[20];
	for (int i=0;i < 20; i++)
	    numbs[i]=(int)(Math.random()*10000);
	//The array has now been created

	//make an array for buckets
	ArrayList[] buckets= new ArrayList[10];
	for (int i = 0; i < 10; i++){
	    ArrayList<Integer>  LIST = new ArrayList();
	    buckets[i] = LIST;
	}

	System.out.println(numbs);
	//	int n = 0;


	for (int n =0; n<4; n++){
	    for (int i =0; i<numbs.length;i++){
		buckets[(numbs[i] / (int)(Math.pow(10,n)))%10].add(numbs[i]);
	    }
	    //numbs = buckets;
	    int k = 0;
	    for (int i = 0; i < 10; i++){
		for (int j = 0; j < buckets[i].size(); j++){
		    numbs[k] = buckets[i].get(j);
		    k++;
		}
	    }
	    System.out.println(numbs);
	}
    }

}
