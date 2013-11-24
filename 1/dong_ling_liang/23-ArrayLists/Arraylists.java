import java.io.*;
import java.util.*;

public class Arraylists{
    public ArrayList<Integer> reverseList(ArrayList<Integer> ref){
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i=ref.size()-1; i>=0; i--){
	    temp.add(ref.get(i));
	}
	return temp;
    }
}