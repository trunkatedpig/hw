import java.io.*;
import java.util.*;


public class Driver {
    public static void main (String[] args) {
        ArrayList[] buckets = new ArrayList[10];
        
        for (int i = 0; i < 10; i++) {
            buckets [i] = new ArrayList();
        }


        int [] a = new int [4];


        Random r = new Random();
        
        for (int i = 0; i < 4; i++) {
            a[i]= r.nextInt(9999);
        }


        int n = 0;


        for (int i = 0;i < a.length; i++) {
            buckets[(a[i]/10^n)% 10].set(a[i]);
        }
    }
}

