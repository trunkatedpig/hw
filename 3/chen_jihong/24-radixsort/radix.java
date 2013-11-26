import java.util.*;

public class radix{
    ArrayList[] buckets = new ArrayList[10];
    int[] integers = new int[10];
    public void makeintarray(){
	for (i = 0; i < 10; i++) {
	    integers[i] = 1000 + (int)(Math.random() * ((9999-1000) +1 ));
	}
    }
    public int[] radixsort(int[] num){
	for (i =0; i < 10; i++) {
  

	