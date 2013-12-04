import java.util.*;
import java.io.*;

public class Array{
    private ArrayList<Integer> rever; 
    
    public void reverse(ArrayList name){
	for (int i = 0; i < name.size()-1/2;i++){
	    name.set(name.size() - 1 - i,name.get(i));
	    name.set(i,name.size() - 1 - i);
	   
	}
	rever = name;
    }
    
    public ArrayList<Integer> printArray(){
	return rever;
    }
   
}
