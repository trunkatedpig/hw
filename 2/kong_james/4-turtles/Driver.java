/*Worked with Victor Gaitour*/
import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Person p;
	p = new Person("Bob");
	Turtle t;
	t = new Turtle("Bobby",1,2);
	System.out.println("Turtle name: " + t.getName());
	System.out.println("Turtle speed: " + t.getSpeed());
	System.out.println("turtle age:" + t.getAge());
	
    }
}
