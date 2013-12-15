import java.util.*;
import java.io.*;

public class Driver{
	public static void main(String[] args){
            Person p1;
            Turtle t1;
            p1 = new Person("John");
            t1 = new Turtle("Froggie",2,4);
            p1.setTurtle(t1);

            System.out.println("Turtle's speed is " + p1.getTurtleSpeed());
        }
}
