import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	//Turtle Class Tests   
	Turtle one; 
	one = new Turtle();
	one.setTurtle ();
	one.speedUp(10);
	System.out.println(one.getname());
	System.out.println(one.getage());
	System.out.println(one.getspeed()); 
		
	Turtle two;
	two = new Turtle();
	two.setTurtleName ("Kemraj");
	two.slowDown(2);
	System.out.println(two.getname());
	System.out.println(two.getage());
	System.out.println(two.getspeed());
        
	Turtle three;
	three = new Turtle();
	three.setTurtleNameInfo ("Alicia",20,16);
	three.getOlder();
	System.out.println(three.getname());
	System.out.println(three.getage());
	System.out.println(three.getspeed());
    }
}	
