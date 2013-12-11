import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<String> al = new ArrayList<String>();
	ArrayList<String> a2 = new ArrayList<String>();
        long timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90000;i++){
	    al.add(0,"X");
	}
	System.out.println(System.currentTimeMillis() - timeNow);
	
	timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90000;i++){
	    a2.add("X");
	}
	System.out.println(System.currentTimeMillis() - timeNow);

	//al == 2301 milli
	//a2 == 5 milli
	
	
        timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90000;i++){
	    al.remove(0);
	}
	System.out.println(System.currentTimeMillis() - timeNow);
	
	timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90000;i++){
	    a2.remove(a2.size()-1);
	}
	System.out.println(System.currentTimeMillis() - timeNow);
	
	//a1 == 2340milli
	//a2 == 1 milli
    }
}