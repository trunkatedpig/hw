import java.io.*;
import java.util.*;

public class bucketSort{
    
    private ArrayList[] buckets = new ArrayList[10];
    private int[] rand4DigitNums = new int[15];
    private int n;
    
    public bucketSort(){
	n=0;
	for (int i = 0; i < 10; i++){
            buckets[i] = new ArrayList();
        }
        Random r = new Random();
        for (int j = 0; j<rand4DigitNums.length; j++){
            rand4DigitNums[j] = r.nextInt(10000);
        }
    }
    public String get(){
        return Arrays.toString(rand4DigitNums);
    }
    
    public int[] get4Digit(){
        return rand4DigitNums;
    }
    
    public ArrayList[] sort(){
	for (int i = 0; i < 10; i++){
            buckets[i] = new ArrayList();
        }
	for (int i = 0; i < rand4DigitNums.length; i++){
	    int exp = (int)(Math.pow(10,n));
	    int place=((rand4DigitNums[i]/exp)% 10);
	    buckets[place].add(rand4DigitNums[i]);
	}
     	return buckets;
    }
    
    public void each(){
	for (n=0; n<4; n++){
	    System.out.println("Sorting " + Math.pow(10,n) + "'s place:");
	    System.out.println(Arrays.toString(sort()));
	    System.out.println("-----------------------------");
	}
    }
}
