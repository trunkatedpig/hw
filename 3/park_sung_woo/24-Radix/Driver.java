import java.util.*;

public class Driver{
    public static void main(String[] args){
	Radix r = new Radix(4,10);
	System.out.println(Arrays.toString(r.sort()));
        Random rand = new Random();

       //1,000,000 3 digit number
        int[] a = new int[1000000];
        for (int i=0;i<1000000;i++){
            a[i] =  100 + rand.nextInt(900);
        }
        long s = System.currentTimeMillis();
        Arrays.sort(a);
        System.out.println(System.currentTimeMillis()-s);
        //66ms 
        s = System.currentTimeMillis();
        Radix r2 = new Radix(3,1000000);
        int[] test  = r.sort();
        System.out.println(System.currentTimeMillis()-s);
        //43ms
    }
}
