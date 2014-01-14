import java.util.*;
import java.io.*;

public class Sort {

        private int[] nums;
        private Random r = new Random(); 
        private int g;

        public Sort(){
        g = r.nextInt(25) + 1;
        nums = new int[g];
        for (int i = 0; i < g; i++)
                nums[i] = r.nextInt(10);
        }

        public String toString() {
                String s = "";
                for (int i = 0; i<g;i++)
                        s = s + nums[i] + ", ";
                return s;
        }
        
        public void bSort(){
        boolean done = false; 
        int n = 0; 
        int i = 0;
        int s = 0;
        int c = 0;
        while (!done){
                done = true;
                for (i=0; i < g - 1; i++){
                        c++;
                        if (nums[i] > nums[i+1]){
                                n = nums[i]; 
                                nums[i] = nums[i+1]; 
                                nums[i+1] = n; 
                                done = false;
                                s++;
                        }
                }
        }
        System.out.println("Comparisons: " + c);
        System.out.println("Swaps: " + s);
        //return nums;
        }
}
