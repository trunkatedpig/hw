import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable
       when we declare it like this:
    */
    //private String greeting="Go away"; 

    private String greeting; 
    private String happygreeting, sadgreeting;

    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }

    public Greeter() {
	    setHappy("Welcome");
	    setSad("Leave me alone");
    }

    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad(String greet) {
	sadgreeting = greet;
    }

    public String happyGreet(String name) {
	String message;
	message = happygreeting + " " + name + ".";
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name + ".";
	return message;
    }


    /* 
       Examples of method overloading. 
       Notice that each method has a
       unique signature, that is, the order and types of the
       parameters are unique. 
       Java doesn't care about the parameter names
    */
    public void f() {
    }
    public void f(String name1)  {
    }
    public void f(String name1, String name2) {
    }
    public void f(String name1, int name2) {
    }
    public void f(int name1, String name) {
    }
    /*
      This one doesn't work because we already
      have a method f with a String, String 
      signature

    public void f(String name2, String name1) {
    }
    */


}

