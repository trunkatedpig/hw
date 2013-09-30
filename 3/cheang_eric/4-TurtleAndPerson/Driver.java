import java.io.*;
import java.util.*;

public class Driver {

    public void printAge(Turtle turtleVariable){
	    
     System.out.println(turtleVariable.getAge());

    } 

    public void printName(Turtle turtleVariable){
	    
     System.out.println(turtleVariable.getName());

    } 

     public void printSpeed(Turtle turtleVariable){
	    
     System.out.println(turtleVariable.getSpeed());

    } 

    public static  void main(String[] args) {

	Turtle Tom,Cameel,MrShell;
    

    
    
	   
        


	Tom = new Turtle();
	System.out.println(Tom.getName());
	System.out.println(Tom.getAge());
	System.out.println(Tom.getSpeed());
	
	Cameel = new Turtle("Cameel", 23, 32 );
       	System.out.println(Cameel.getName());
	System.out.println(Cameel.getAge());
	System.out.println(Cameel.getSpeed());

	MrShell = new Turtle("MrShell");
	printAge(MrShell);
	printName(MrShell);
        printSpeed(MrShell);


    }}
	
		 
	

		 
