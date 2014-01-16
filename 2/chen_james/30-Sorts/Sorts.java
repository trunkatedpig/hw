import java.io.*;
import java.util.*;
//worked with victor

public class Sorts {
    private int arraylength;
    private int digits;
    private int[] nums;
    private ArrayList<Integer>[] buckets;
    private int[] temp;


    public Sorts(int a, int b){
	arraylength = a;
	digits = b;
	nums = new int[arraylength];
	for (int i = 0; i < arraylength; i++){
	    nums[i] = (int) (Math.random() * Math.pow(10,b));
	}
    }

    public String toString (){
	return (Arrays.toString(nums));
    }

	public void sort(){
        for (int digit = 0; digit < digits; digit ++){
            buckets = new ArrayList[10];
            for (int i = 0; i < 10; i ++){
                buckets[i] = new ArrayList();
            }
            for (int current = 0; current < arraylength; current ++){
                int digitval = (int) (nums[current] / Math.pow(10, digit)) % 10;
                buckets[digitval].add(nums[current]);
            }
            temp = new int[arraylength];
            int place = 0;
            for (int j = 0; j < 10; j++){
                for (int aplace = 0; aplace < buckets[j].size(); aplace ++){
                    temp[place] = (Integer)buckets[j].get(aplace);
                    place = place + 1;
                }
            }
            nums = temp;
        }
    }
	
public void bsort( int [] num ){
    int j;
	boolean swap = true;   
    int temp;  

    while (swap) {
		swap= false;   
        for( j=0;  j < num.length -1;  j++ ) {
            if ( num[ j ] < num[j+1] )  {
                temp = num[ j ];              
                num[ j ] = num[ j+1 ];
                num[ j+1 ] = temp;
                swap = true;             
            } 
        } 
    } 
} 
	
public void insert(int [] num){
     int j;                   
     int insert;               
     int i;  

     for (j = 1; j < num.length; j++)  {
        insert = num[ j ];
        for(i = j - 1; (i >= 0) && (num[ i ] < insert); i--)   {
			num[ i+1 ] = num[ i ];
        }
         num[ i+1 ] = insert;    
     }
}

public void selection ( int [] num ){
     int i, j, first, temp;  
     for ( i = num.length - 1; i > 0; i - - )  {
        first = 0;   
        for(j = 1; j <= i; j ++)   {
            if( num[ j ] < num[first] )         
                first = j;
        }
        temp = num[ first ];  
        num[ first ] = num[ i ];
        num[ i ] = temp; 
    }           
}





}
