// Worked with Danny Qiu

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Turtle t,t2;
	t = new Turtle("Mr.Z", 9999, -5);
	t2 = new Turtle("Mr.K");

	System.out.println("Turtle 1 name: " + t.getName());
	System.out.println("Turtle 1 speed: " + t.getSpeed());
	System.out.println("Turtle 1 age: " + t.getAge());
	System.out.println("Turtle 2 name: " + t2.getName());
	System.out.println("Turtle 2 speed: " + t2.getSpeed());
	System.out.println("Turtle 2 age: " + t2.getAge());

	System.out.println("---");

	Person p;
	p = new Person("Ms.P");
	p.setTurtle(t);

	System.out.println(p.getPersonName() + " pet Turtle: " + p.getPet());
	System.out.println(p.getPersonName() + " pet Turtle's speed: " + p.getTurtleSpeed());
	System.out.println(p.getPersonName() + " pet Turtle's name: " + p.getTurtleName());
    }
}
