import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> newarray = new ArrayList<Integer>();
	for (int i = 0; i < 10; i ++){
	    newarray.add(i);
	}

	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = newarray.size()-1;i >=0; i --){
	    temp.add(newarray.get(i));
	}
	newarray= temp;
//adding to end slower after 100000 items
//adding to beginning slower after 10000 items
//removing from end slower after 1000000
//removing from beginning slower after 10000
//changing the end is much faster than beginning    }
}
