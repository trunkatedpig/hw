import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        int[] A = new int[5];
        Random r = new Random();
        for (int i = 0; i<A.length; i++){
         A[i] = r.nextInt(10000);
        }

        Radix R = new Radix();
        System.out.println(R.toString(R.sort(A)));
    }
}
