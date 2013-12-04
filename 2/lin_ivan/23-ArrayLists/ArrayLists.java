import java.io.*;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args){

        //faster method
        long start, t;

        ArrayList<Integer> a = new ArrayList<Integer>();
        int b = 1000000;
        for (int i = 0; i < b; i ++){
            a.add(i);
        }
 

        //took signifigantly longer than pervious method

        /*
        ArrayList<Integer> c = new ArrayList<Integer>();
        int d = 1000000;
        for (int i = 0; i < d; i ++){
            c.add(0,100);
        }
        */
        
        //testing remove
        //slower

        /*        for (int i = 0; i <a.size(); i++){
            a.remove(i);
              }
        */
        
                
        //faster
        /*        start = System.currentTimeMillis();
                  for (int i = a.size() - 1; i > 0; i--){
            a.remove(i);
                  }
        */

        //Reversal
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int j = a.size()-1;
        for (int i =0; i < a.size(); i++){
            ans.add(a.get(j));
            j--;
        }

        }
}
