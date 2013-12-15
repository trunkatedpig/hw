import java.io.*;
import java.util.*;

public class Greeter {

    // We can initialize instance variables
    // when we declare them
    //private String greeting="default"; 

    private String greeting;
    public String happygreeting;
    public String sadgreeting;
    public  Greeter() {
	happygreeting = "What's up";
	sadgreeting = "I don't want to talk";
    }
    public Greeter(String a, String b) {
	    happygreeting = a;
	    sadgreeting = b;
	    }
    public void sethappy(String arg) {
	happygreeting = arg;
    }
     public void  setsad(String arg) {
	sadgreeting = arg;
    }
    public  String happygreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }
    public String sadgreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
/* I worked with Maria*/
	

    /* 
       Examples of overloading 
       
       public void f() {
       }
       public void f(String name){
       }
       public void f(String name, String name2) {
       }
       public void f(int name) {
       }
       
       This one won't work -- String String is
       already used
       public void f(String name2, String name1) {
       }
    */

    /*    
    public Greeter(String g) {
	setGreeting(g);
    }

    public Greeter() {
	setGreeting("hello");
    }

    public void setGreeting(String greet) {
	greeting = greet;
	}*/

}
