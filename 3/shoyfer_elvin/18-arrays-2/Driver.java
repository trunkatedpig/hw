import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
    	Arrays2 a2 = new Arrays2();
    	int[] test1 = a2.RevFill(10);
    	for (int i = 0; i < 10; i++) {
    		System.out.println(test1[i]);
    	}
    	System.out.println("<---- divider ---->");
    	int[] test2 = a2.MakeRandom(15, 4, 10);
    	for (int i = 0; i < 15; i++) {
    		System.out.println(test2[i]);
    	}
    	System.out.println("<---- divider ---->");
    	System.out.println("Problems 3 and 4 are Codingbat problems.");
    	System.out.println("They compiled and the results were correct for all cases.");



    }
}