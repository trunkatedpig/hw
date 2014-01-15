import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        BubbleSort s = new BubbleSort();
        Random r= new Random();

        int[] a= new int[20];
        for (int x=0; x<a.length; x++){
            a[x]=r.nextInt(100);
        }
        s.bsort(a);
        System.out.println(s.toString(a));
    }
}
