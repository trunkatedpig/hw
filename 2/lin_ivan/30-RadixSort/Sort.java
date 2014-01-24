import java.io.*;
import java.util.*;

public class Sort{
    public void bsort(int[] a){
        int temp=0;
        int numSorts=0;
        int sortsPerFor=0;
        int numIfs=0;
        long time;
        long start = System.currentTimeMillis();
        for(int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    numIfs=numIfs+1;
                    numSorts=numSorts+1;
                    sortsPerFor=sortsPerFor+1;
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            if(sortsPerFor==0){
                System.out.println( Arrays.toString(a));
                time = System.currentTimeMillis()-start;
                System.out.println(time);
            }
            sortsPerFor=0;
        }
        System.out.println( Arrays.toString(a));
        time = System.currentTimeMillis()-start;
        System.out.println(time);
    }
    public static void main(String[] args){
        Sort b = new Sort();
        Random r = new Random();
        int[] randstuff=new int[10000];
        for(int i = 0;i<randstuff.length;i++)
            randstuff[i]=r.nextInt(89999)+10000;
        b.bsort(randstuff);
    }
}