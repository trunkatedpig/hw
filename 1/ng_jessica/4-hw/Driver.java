//SAPPHA O'MEARA AND JESSICA NG

import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main (String[] args) {
	Turtle t1, t2, t3; 
	t1 = new Turtle(); 
	t2 = new Turtle("Georgie"); 
	t3 = new Turtle ("Harry", 4, 8);
	
	String r1;
	int r2, r3;
	r1 = t1.getName();
	r2 = t2.getAge();
	r3 = t3.getSpeed();
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	
	//the get functions work

	t1.speedUp(5);
	t2.speedDown(2);
	t3.getOlder();
	
	int a1, a2, a3;
	a1 = t1.getSpeed();
	a2 = t2.getSpeed();
	a3 = t3.getAge();

	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);

	//the speedUp, speedDown, and getOlder functions work
	
    }
}
    
