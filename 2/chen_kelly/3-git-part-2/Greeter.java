import java.io.*;
import java.util.*;

public class Greeter {

    // static makes the variable 
    // shared by all instances
    //static private String greeting; 
    
    /* You can initialize instance variables
       when you declare them, like this */
    //private String greeting="Hello"; 

    private String happygreeting;
    private String sadgreeting;
    

    public Greeter(String g, String g2) {
	setHappy(g);
        setSad(g2);
    }

    public Greeter() {
	setHappy("BONJOUR");
	setSad("GO AWAY");
    }

    // examples of method overloading
    public void f() {
    }
    public void f(String s) {
    }
    public void f(String s,String s2) {
    }
    public void f(String s,int s2) {
    }
    public void f(int s,String s2) {
    }
    /*
      but this one doesn't work becasue
      we've already used String,String -
      it's about the types, not the names

    public void f(String s2,String s1) {
    }
    */
    

    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad(String greet) {
	sadgreeting = greet;
    }

    public String happyGreet(String name){
	String message;
	message = happygreeting + " " + name;
	return message;
    }


    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}
