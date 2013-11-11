import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	Array a = new Array();
	int[] new2 = a.RevFill(20);	
	for (int i = 0; i<new2.length;i++){
	    System.out.print(new2[i] + " ");
	}
	System.out.println("");
	int[] new1 = a.MakeRandom(10,0,10);
	for (int i = 0; i<new1.length; i++){
	    System.out.print(new1[i] + " ");
	}
	System.out.println("\n");
    }
}