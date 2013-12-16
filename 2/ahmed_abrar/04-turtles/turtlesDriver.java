import java.io.*;
import java.util.*;

public class turtlesDriver {
    public static void main (String[] args) {
	turtles turtle;
	//turtle = new turtles();
	//System.out.println(turtle.ret());
	//turtle = new turtles("Abrar");
	//System.out.println(turtle.ret());
	//turtle = new turtles(54,89,"Bob");
	//System.out.println(turtle.ret());
	turtle = new turtles();
	Person Abrar;
	Abrar = new Person("Abrar");
	Abrar.setTurtle(turtle);
	//System.out.println(Abrar.getpet());
	System.out.println(Abrar.getTurtleSpeed());
	    }
}
