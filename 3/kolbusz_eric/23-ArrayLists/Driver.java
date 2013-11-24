import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	/*
	  ArrayList<String> a = new ArrayList<String>();
	  ArrayList<String> b = new ArrayList<String>();
    
	  public void fillTime(int n) {
	  long startA = System.currentTimeMillis();
	  for (int i=0; i<n; i++)
	  a.add("mmmm");
	  long endA = System.currentTimeMillis();
	  long elapsedA = endA-startA;
	  System.out.println("a.add('mmmm') "+n+" times takes "+elapsedA);
	
	  long startB = System.currentTimeMillis();
	  for (int i=0; i<n; i++)
	  b.add(0,"mmmm");
	  long endB = System.currentTimeMillis();
	  long elapsedB = endB-startB;
	  System.out.println("b.add(0,'mmmm') "+n+" times takes "+elapsedB);
	  System.out.println();
	  }
	*/

	//a.add("mmmm") was quicker
	//number of strings ||  time a  ||  time b
	//----------------------------------------
	//       10         ||     0    ||    0
	//      100         ||     0    ||    0
	//      1000        ||     0    ||    1
	//     10000        ||     1    ||    39
	//     100000       ||     5    ||   1036
	//    1000000       ||     7    ||  136305
	//    10000000      ||    125   || would finish running on December 28th





	/*
	  ArrayList<String> a = new ArrayList<String>();
	  ArrayList<String> b = new ArrayList<String>();

	  public void rmvTime(int n) {
	  for (int i=0; i<n; i++) {
	  a.add("mmmm");
	  b.add("mmmm");}
	
	  int aS = a.size();
	  int bS = b.size();
	
	  long startB = System.currentTimeMillis();
	  for (int i=bS-1; i>=0; i--) 
	  b.remove(i);
	  long endB = System.currentTimeMillis();
	  long elapsedB = endB-startB;
	  System.out.println("b.remove(<end>) "+n+" times takes "+elapsedB);

	  long startA = System.currentTimeMillis();
	  for (int i=0; i<aS; i++) 
	  a.remove(0);
	  long endA = System.currentTimeMillis();
	  long elapsedA = endA-startA;
	  System.out.println("a.remove(0) "+n+" times takes "+elapsedA);
	  System.out.println();
	  }
	*/

	//b.add(<end>) was quicker
	//number of strings ||  time a  ||  time b
	//----------------------------------------
	//       10         ||     0    ||    0
	//      100         ||     0    ||    0
	//      1000        ||     1    ||    0
	//     10000        ||    35    ||    1
	//     100000       ||    807   ||    1
	//    1000000       ||  107104  ||    4
	//    10000000      || 32 hours ||   34
	
	



	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i=0; i<9; i++)
	    a.add(i*3);
	
	System.out.println(a);

	for (int i=0; i<(a.size()/2); i++) {
	    int temp = (int)a.get(a.size()-1-i);
	    a.set(a.size()-1-i,a.get(i));
	    a.set(i,temp);
	}
	
	System.out.println(a);
    }
}
