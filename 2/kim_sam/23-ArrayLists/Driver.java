import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {

        //a.add(0, "x") took more time than a.add("x") and its time rose exponentially
        //a.remove(0, "x") and a.remove("x") were the same

        ArrayList<Integer> L = new ArrayList<Integer>(10);
	Random r = new Random();

        for(int i = 0; i < 10; i++){
            L.add(r.nextInt(10));
        }
        
        System.out.println(L);

	ArrayList<Integer> temp = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++){
	    temp.add(L.get(9 - i));
        }
	
	L = temp;
	
        System.out.println("Reversed\n" + L);
    }
}