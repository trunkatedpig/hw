/*Worked with Victor Gaitour*/
import java.io.*;
import java.util.*;

public class Person {
    public String name;
    public Turtle t;
   
    public void setTurtle(Turtle t){
	t = new Turtle();
}
    public Person(String n){
	name = n;
}
    public Turtle getPet(){
	return t;
}
    public int getTurtleSpeed(){
	return t.getSpeed();
    }
}  
