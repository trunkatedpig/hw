import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
	Haircut h = new Haircut();
	
	System.out.print("[");
	for (int i = 0; i < h.RevFill(10).length; i++) {
	    System.out.print(h.RevFill(10)[i] + ", ");
	}
	System.out.print("]");
	   
	
	System.out.println();
	
	for (int i = 0; i < h.MakeRandom(10, 0, 100).length; i++) {
	    System.out.print( h.MakeRandom(10, 0, 100)[i] + ", "); }

	System.out.println("    ");
	System.out.println(h.sum(100));
	System.out.println(h.sum(2));
    }
}