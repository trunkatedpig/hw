import java.io.*;
import java.util.*;

public class Arraylists{
    public static void main(String[] args){
	ArrayList <Integer> a = new ArrayList <Integer>();
	long t = System.currentTimeMillis();
	// for (int i =0; i <1000000; i++){
	//     a.add(1);
	// }
	// System.out.println("Time:" +""+ (System.currentTimeMillis()-t));
	//time increased somewhat
	for (int i =0; i <100000; i++){
	    a.add(0,1);
	 }
	 System.out.println("Time:" +""+ (System.currentTimeMillis()-t));
	 // increas exponentially goes from 26 to ~1500 from 10000 to 100000
	
    }
} 