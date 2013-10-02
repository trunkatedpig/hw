import java.io.*;
import java.util.*;

public class Driver{

// vanessa yu elise zlotnikova//

    public static void main(String[] args){
	Turtle t1,t2,t3;

	/*Turtle with no parameters
	t1 = new Turtle();

	System.out.print("Name: ");
	System.out.println(t1.getName());

	System.out.print("Speed: ");
	System.out.println(t1.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t1.getAge());
	*/

	/*Turtle with name param
	t2 = new Turtle("Yoe");

        System.out.print("Name: ");
	System.out.println(t2.getName());

	System.out.print("Speed: ");
	System.out.println(t2.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t2.getAge());
	*/
	
	//Turtle with 3 params
	t3 = new Turtle("Wazzup",5,20);
	
	System.out.print("Name: ");
	System.out.println(t3.getName());

	System.out.print("Speed: ");
	System.out.println(t3.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t3.getAge());
       
	//Person.java Test
	Person Elise;
	Elise = new Person(); 

	Elise.setTurtle(t3);
	System.out.print("Turtle's Name: ");
	System.out.println(Elise.getPet().getName());
	
	System.out.print("Turtle's Speed: ");
	System.out.println(t3.getSpeed());
	
    }
}
