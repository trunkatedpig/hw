//Jeffrey He and Dmitriy Kagno
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	
	Turtle t,t2,t3;
	Person p,p2,p3;
	t = new Turtle();
	t2 = new Turtle("Tim");
	t3 = new Turtle("Tod",2,2);
       
	p = new Person("James");
	p2 = new Person("Pencil");
	p3 = new Person("Pen");

	p.setTurtle(t);
	p2.setTurtle(t2);
	p3.setTurtle(t3);

	System.out.println(t.getResult());
       	System.out.println(t2.getResult());
	System.out.println(t3.getResult());
	System.out.println("___________");
	System.out.println(p.getTurtleSpeed());
       	System.out.println(p2.getPet().getName());
	System.out.println(p3.getPet().getSpeed());
    }
}

