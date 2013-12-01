import java.io.*; 
import java.util.*; 

public class Buckets{
    private ArrayList[] buckets = new ArrayList[10]; 
    private Random r; 
    private int[] nums; 
   
    public Buckets(){ 
	for (int i = 0; i < 10; i++)
	    buckets[i] = new ArrayList(); 
    } 
    public void makeNums(){
	nums = new int[10]; 
	for (int i = 0; i < 10; i++){
	    nums[i] = r.nextInt(10000); 
	}
    }

    public int[] getNums(){
	return nums;}
    
    public void tally(){
	int n = 0; 
	int i = 0; 
	int x = 0; 
	for (n = 0; n < 4; n++){
	    while (i < 10){ 
		x = (int)Math.pow(10, n); 
		x = (nums[i] / x) % 10; 
		buckets[x].add(nums[i]); 
		i++; 
	
	    }
	}
    }		
		
    public void addBack(){
	int a = 0;
	for (int i = 0; i < 10; i++){
	    for(int x = 0; x < buckets[i].size(); x++){
		nums[a] = (Integer)buckets[i].get(x); 
		a++; 
	    }
	}
    } 
}
