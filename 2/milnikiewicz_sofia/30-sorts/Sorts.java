import java.io.*;
import java.util.*;

public class Sorts {

    private int digits = 4;
    private int numNum = 10;
    private int[] values = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
   
    public Sorts(){
        for (int i=0; i<numNum; i++){
            buckets[i] = new ArrayList();
        }
        for (int i=0; i<numNum; i++){
            Random temp = new Random();
            values[i]= (int)temp.nextInt(9000)+1000;
        }
    }
    
    public Sorts(int dig,int nums){
        buckets = new ArrayList[nums];
        values = new int[nums];
        digits = dig;
        numNum = nums;
        for (int i=0; i<nums; i++){
            buckets[i] = new ArrayList();
        }
        for (int x=0; x<nums; x++){
            Random temp = new Random();
            values[x]= (int)temp.nextInt(9000)+1000;
        }
    }

    public void radixSort(){
        for (int i=0; i<digits; i++){
            for (int j=0; j<numNum; j++){
                double temp = values[j]/Math.pow(10,i);
                buckets[(int)temp%10].add(values[j]);
            }
            int n=0;
            for (int m=0; m<numNum; m++){
                for (int k=0; k<buckets[m].size(); k++){
                    values[n]=(Integer)buckets[m].get(k);
                    n=n++;
                }
            }
            for (int b=0; b<buckets.length; b++){
                buckets[b].clear();
            }
        }
    }

    public String toString(){
        return Arrays.toString(values);
    }

    // BUBBLE SORT STUFF STARTS HERE
    // uses same array (values) as radix
    public void bSort() {
        int count = 0;
        int swaps = 0;
        for (int i=0; i<values.length-1; i++) {
            for (int j=0; j<values.length-1; j++) {
                count++;
                if (values[j] > values[j+1]) {
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    swaps++;
                }
            }
        }
    }
   
}
