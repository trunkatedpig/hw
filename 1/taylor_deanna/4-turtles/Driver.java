import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Turtle dt, ap, af;

	dt = new Turtle();
	System.out.println("Hi, my name is "+ dt.getName() +"!");
	System.out.println("I am "+ dt.getAge() + " years old.");
	System.out.println("My speed is "+ dt.getSpeed());

	ap = new Turtle("Austen");
	System.out.println("Hi, my name is "+ ap.getName() +"!");
	System.out.println("I am "+ ap.getAge() + " years old.");
	System.out.println("My speed is "+ ap.getSpeed());

	af = new Turtle("Andrew Fischer",104,2);
	System.out.println("Hi, my name is "+ af.getName() +"!");
	System.out.println("I am "+ af.getAge() + " years old.");
	System.out.println("My speed is "+ af.getSpeed());
    }
}