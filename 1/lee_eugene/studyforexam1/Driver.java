//Driver

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {

	Turtle A, B;

	A = new Turtle("Sydney", 16, 12);
	System.out.println("Turtle A's name is " + A.getName());
	System.out.println(A.getName() + "'s speed is " + A.getSpeed());
	System.out.println(A.getName() + "'s age is " + A.getAge());


	B = new Turtle("Mr. Z", 299, 137872);
	System.out.println("Turtle B's name is " + B.getName());
	System.out.println(B.getName() + "'s speed is " + B.getSpeed());
	System.out.println(B.getName() + "'s age is " + B.getAge());

       	///////////////////
	System.out.println("_____________________")
	
	Person p1, p2;
	
	p1 = new Person("Señor Garfinkel");
	p1.setTurtle(A);
	System.out.println(p1.getOwnerName() + "'s pet turtle is named " + p1.getPet().getName());
	System.out.println(p1.getOwnerName() + "'s pet turtle's speed is " + p1.getTurtleSpeed());
	System.out.println(p1.getOwnerName() + "'s pet turtle's age is " + p1.getPet().getAge());
	
	p2 = new Person("Edric Huang");
	p2.setTurtle(B);
	System.out.println(p2.getOwnerName() + "'s pet turtle is named " + p2.getPet().getName());
	System.out.println(p2.getOwnerName() + "'s pet turtle's speed is " + p2.getTurtleSpeed());
	System.out.println(p2.getOwnerName() + "'s pet turtle's age is " + p2.getPet().getAge());




    }
}
