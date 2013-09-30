import java.io.*;
import java.util.*;

public class Person{
	Turtle turtle1;
	private String name;

	//Constructor
	public Person (String namer){
		name=namer;
		}

	//Methods
	public void setTurtle (Turtle t){
		turtle1 = t;
		}

	public Turtle getPet(){
		return turtle1;
		}
	
	public int getTurtleSpeed(){
		return turtle1.getspeed();
		}
	

	
	}
