import java.io.*;
import java.util.*;

//size of ArrayLists starts at 100, and goes up by powers of 10

//add(str) - adding to end
//0.0
//0.0
//2.0
//14.0
//29.0

//add(pos,str) - also adding to end
//0.0
//0.0
//5.0
//18.0
//42.0

//add(pos,str) - adding to beginning
//1.0
//1.0
//49.0
//2899.0
//(forced quit after 5-10 minutes and an overheated CPU)

//remove(pos) - removing from end
//0.0
//0.0
//3.0
//2.0
//14.0

//remove(pos) - removing from beginning
//0.0
//1.0
//46.0
//1668.0
//159247.0


public class Driver {
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random r = new Random();
	
	for (int i = 0; i < 50; i= i +1){
	    a.add(r.nextInt(100));
	}

	System.out.println(a);
	
	ArrayList<Integer> reverse = new ArrayList<Integer>();
	for (int j = 49; j > 0;j = j - 1){
	    reverse.add(a.get(j));
	}

	System.out.println(reverse);

	
    }
    
    
        
}


