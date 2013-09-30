import java.io.*;
import java.util.*;

<<<<<<< HEAD
public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g = new Greeter("Welcome");
	//	g.setHappyGreeting("Welcome");
	g2 = new Greeter("Go away");
	//	g2.setSadGreeting("Go away");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);

=======
public class Greeter {

    public String greeting; 
    /* 2. change public to private,
       test, then change back 
    */


    /* 3. change public to private,
       test, then change back 
    */
    public void setGreeting(String greet) {
	greeting = greet;
    }

    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
>>>>>>> 6a7f15dece621c0221fe28450a5133fd59a68790
    }
}
