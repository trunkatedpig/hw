import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	//Turtle Class Tests   
	Turtle one; 
	one = new Turtle();
	one.speedUp(10);
	System.out.println("Turtle one's name is " + one.getname());
	System.out.println(one.getname() +  " is "  + one.getage() +
			   " years old.");
	System.out.println(one.getname() + "'s speed is " + one.getspeed()); 

	Turtle two;
	two = new Turtle("Kemraj");
	two.slowDown(2);
	System.out.println("Turtle two's name is " + two.getname());
	System.out.println(two.getname() + " is " + two.getage()+ 
			   " years old.");
	System.out.println(two.getname() + "'s speed is " + two.getspeed());
        
	Turtle three;
	three = new Turtle("Alicia",20,16);
	three.getOlder();
	System.out.println("Turtle three's name is " + three.getname());
	System.out.println(three.getname() + " is " + three.getage() +
			   " years old.");
	System.out.println(three.getname() + "'s speed is " + 
			   three.getspeed());

	//Person testing
	Person bob;
	bob = new Person ("Robert");
	bob.setTurtle (two);
	bob.getPet();
	System.out.println (bob.getTurtleSpeed());

	
    }
}	
