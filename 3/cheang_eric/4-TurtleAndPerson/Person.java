import java.io.*;
import java.util.*;

public class Person{
    
    private String Name;
    private Turtle OwnedTurtle;


    public void getPet(Turtle turtleName){
	
	OwnedTurtle = turtleName;
    }


    public Person(String givenName, Turtle turtleName){
	
	Name = givenName;
        getPet(turtleName);
	
	
    }

	


    public int getTurtleSpeed(Person personName){
	
	return OwnedTurtle.getSpeed();
	    }}  
    
    


