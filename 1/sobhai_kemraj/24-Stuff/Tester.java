import java.io.*;
import java.util.*;

public class Tester{
    public static void main(String [] args){
	ArrayList[] buckets= new ArrayList[10];
	for (int i = 0; i < 10; i++){
	    ArrayList <Integer> LIST = new ArrayList();
	    buckets[i] = LIST;
	}
	buckets[1].add(1000);
	int[]a = new int[10];
	a[1] = buckets[1].get(0);
    }
}
