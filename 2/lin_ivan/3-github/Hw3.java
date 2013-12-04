import java.io.*;
import java.util.*;

public class Greeter {
   private String greeting;
   private String happygreeting, sadgreeting;
    
    public Greeter(String g) {
 setGreeting(g);
    }
    
    public Greeter(String a, String b) {
    sethappygreeting(a);
    setsadgreeting(b);
    }

    public Greeter() {
  //setGreeting("Hello");  
  sethappygreeting("Good Morning") ;
  setsadgreeting("Go away") ; 
    }
    
    public void sethappygreeting(String greet) {
    happygreetering = greet;
    }

    public void setsadgreeting(String greet) {
    sadgreeting = greet;
    }
      
    public void setGreeting(String greet) {
 greeting = greet;
    }

    //public String greet(String name) {
 //String message;
// message = greeting + " " + name;
// return message; }
    
    public String happygreet(String name) {
      String message;
      message = happygreeting + " " + name;
      return message;
    }
    
    public String sadgreet(String name) {
      String message;
      message = sadgreeting + " " + name;
      return message;
    }
    }