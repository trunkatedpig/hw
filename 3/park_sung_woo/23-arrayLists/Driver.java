import java.util.*;

public class Driver{
    public static void main(String[] args){
        
    ArrayList<Object> a = new ArrayList<Object>();
    ArrayList<Object> b = new ArrayList<Object>();

    
    long t = System.currentTimeMillis();
    for (int i=0;i<100000;i++){
        a.add("x");
    }
    System.out.println(System.currentTimeMillis() - t);

    
    /*long s = System.currentTimeMillis();
    for (int i=0;i<100000;i++){
        b.add(0,"x");
    }
    System.out.println(System.currentTimeMillis() - t);
    */

    //Adding element in the front position takes more time
    //Running time-
    //At the end:15ms
    //Beginning:1046ms
    
    /*t = System.currentTimeMillis();
    for (int i=0;i<100000;i++){
        a.remove(0);
    }
    System.out.println(System.currentTimeMillis() - t);
    Takes 1078ms
    */
   t = System.currentTimeMillis();
   for (int i=0;i<100000;i++){
        a.remove(a.size()-1);
   }
   System.out.println(a);
   System.out.println(System.currentTimeMillis()-t);
   //Takes 8ms
   //
   //Removing From the end is much faster
   
    
   for (int i=0;i<15;i++){
        b.add(i);
   }   
   System.out.println(b);
   
   //Code to reverse the array values
   
   for (int i=0;i<b.size();i++){
        b.add(i,b.get(b.size()-1));
        b.remove(b.size()-1);
   }
   System.out.println(b);
    }
}
