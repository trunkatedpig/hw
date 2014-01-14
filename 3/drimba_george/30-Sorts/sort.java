import java.io.*;
import java.util.*;

public class sort {
    private int[] ran = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
    private int compare, swap;

    public void generate() {
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
             ran[i] = r.nextInt(9999);
        }
    }
      public String toString(){
        String r = "";
        for (int i=0;i<ran.length;i++){
            if (i!=ran.length-1)
                r+=ran[i] + ", ";
            else
                r+=ran[i];
        }
        return r;
    }

    public void radixSort(){
        for(int i = 0; i < 4; i++) {
            for(int newi = 0; newi<10; newi++){
                buckets[newi] = new ArrayList();
            }

            for(int j = 0; j <10; j++) {
                int n = ran[j]/((int)(Math.pow(10,i)))%10;
                buckets[n].add(ran[j]);
            }
            
            int y = 0;
            for(int k = 0; k<10; k++) {
                for(int l = 0; l<buckets[k].size(); l++) {
                    int z = (Integer)(buckets[k].get(l));
                    ran[y] = z;
                    y++;
                }
            }
            
        }
    }

    public void bsort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                compare++;
                if(a[j]>a[j+1]){
                    swap++;
                    int n = a[j];
                    a[j] = a[j+1];
                    a[j+1] = n;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort s = new sort();
        s.generate();
        System.out.println(s);
        s.radixSort();
        System.out.println(s);
        s.generate();
        System.out.println(s);
        s.bsort(s.ran);
        System.out.println(s);

    }
} 