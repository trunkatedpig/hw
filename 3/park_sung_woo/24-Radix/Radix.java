import java.util.*;

public class Radix{
    Random r = new Random();
    int size = 0;
    ArrayList[] buckets = new ArrayList[10];
    int[] intList;
    int numDigit = 0;
    public Radix(int n,int s){
        size = s;
        intList = new int[size];
        numDigit = n;
	for (int i=0;i<10;i++){
	    buckets[i] = new ArrayList();
    	}
    
    	for (int i=0;i<intList.length;i++){
	    intList[i] = (int)Math.pow(10,numDigit-1) +r.nextInt(9*(int)Math.pow(10,numDigit-1));
	}
    }

    public int[] sort(){
	for (int n=0;n<numDigit;n++){
	    for (int i=0;i<intList.length;i++){
	    	int digit = 0;
		digit = (intList[i]/(int)Math.pow(10,n))%10;
	        buckets[digit].add(intList[i]);
                
            }
            int intCounter = 0;
            for (int i=0;i<buckets.length;i++){
                for (int j=0;j<buckets[i].size();j++){
                    intList[intCounter] = (Integer)buckets[i].get(j);
                    intCounter++;
                }
            }
            
            for (int i=0;i<10;i++){
                buckets[i] = new ArrayList();
            }
	}
        return intList;
}
}
