import java.io.*;
import java.util.*;

public class Greeter {

    // We can initialize instance variables
    // when we declare them
    //private String greeting="default"; 

    private String happy,sad;

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

    
    public Greeter(String g, String h) {
<<<<<<< HEAD
	sadgreeting(g);
	happygreeting (h);
=======
	sadgreeting(h);
	happygreeting (g);
>>>>>>> 6a7f15dece621c0221fe28450a5133fd59a68790
    }

    public void sadgreeting(String greet) {
	sad = greet;
    }

    public void happygreeting(String greet) {
	happy = greet;
    }

    public String greet(String name) {
	String message;
	message = sad + " " + name + "\n" + happy + " " + name;
	return message;
    }
}
