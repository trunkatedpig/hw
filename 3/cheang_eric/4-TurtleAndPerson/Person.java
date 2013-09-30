import java.io.*;
import java.util.*;

public class Person{
    
    private String Name;
    private Turtle OwnedTurtle;


    public Person(String givenName){
	
	Name = givenName;
	
    }

	

    public void getPet(Turtle turtleName){
	
	OwnedTurtle = turtleName;
    }

    public int getTurtleSpeed(){
	
	return OwnedTurtle.getSpeed();
	    }}  
    
    


