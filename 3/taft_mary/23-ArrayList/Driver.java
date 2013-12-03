import java.io.*;
import java.util.*;

//The following are recordings of the time, in milli-
//seconds, required to run different functions on
//ArrayLists of sizes 100 - 1,000,000 (by powers of 10).

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


//Adding to and removing from the end
//are faster than to and from the beginning,
//because insertions and deletions from a
//given position require that all values in
//the positions following it be shifted--
//a process which takes more and more time
//as the array/ArrayList size increases.


public class Driver {

    public static void main(String[] args) {

	ArrayList a = new ArrayList();
	Random r = new Random();

	for(int i = 0; i<100; i++)
	    a.add(r.nextInt(10000));

	System.out.println(a);
	System.out.println(reverse(a));
    }
    
    public static ArrayList reverse(ArrayList al) {
	//creates a new list rather than reversing the original,
	//so the original is still intact after this method is called
	ArrayList ans = new ArrayList();
	for(int i=al.size()-1, j=0; i>=0; i--, j++)
	    ans.add(j,al.get(i));
	return ans;
    }

}
