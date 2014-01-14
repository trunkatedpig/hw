import java.io.*;
import java.util.*;

public class bsort {
    private ArrayList[] buckets = new ArrayList[10];
    public int[] ran = new int[10];
    private int compares,swaps = 0;

    public void bSort(int[] toSort){
        for(int i=0;i<toSort.length;i++){
            for(int n=0;n<toSort.length-1;n++){
                compares++;
                if(toSort[n]>toSort[n+1]){
                    swaps++;
                    int tmp = toSort[n];
                    toSort[n] = toSort[n+1];
                    toSort[n+1]=tmp;
                }
            }
        }
    }

    private Random r = new Random();
    private ArrayList[] buckets = new ArrayList[10];
    private int slot = 1;
    private int[] nums = new int[20];

    public void radix(){
        for (int i=0; i<10; i++) {
            buckets[i] = new ArrayList();
        }
        for (int i=0; i<20; i++) {
            nums[i] = r.nextInt(10000);
        }
        for (int j=0; j<4; j++) {
            for (int i=0; i<nums.length; i++) {
                int q =((nums[i]/slot) % 10);
                for (int k=0; k<buckets.length; k++) {
                    if (q==k) {
                        buckets[k].add(nums[i]);
                    }
                }
            }
            int i = 0;
            while (i<nums.length) {
                int x = 0;
                while (x<buckets.length) {
                    int y = 0;
                    while (y<buckets[x].size()) {
                        nums[i] =(Integer)buckets[x].get(y);
                        i++;
                        y++;  
                    }
                    x++;
                }
            }
        }
    }      
    public String getb () {
    String ans = "";
    for (int i=0; i<buckets.length; i++) {
        ans = ans + buckets[i].toString();
    }
    return ans;
    }
}
