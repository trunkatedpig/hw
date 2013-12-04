import java.io.*;
import java.util.*;

public class Greet {

<<<<<<< HEAD
    public String greet;

    public Greet(String g) {
	setGreet(g);
    }

    public Greet(){
	setGreet("Good Mornin'");
    }

    public void setGreet(String gree){
	greet = gree;
    }
    
    public String gree(String name){
	String message;
	message = greet + " " + name;
=======
    public String Sgreet,Hgreet;

    public Greet(String g,String h) {
	setSgreet(g,h);
    }

    public Greet(){
	setSgreet("Go away","Good Mornin'");
    }

    public void setSgreet(String Sad,String Happy){
	Sgreet = Sad;
	Hgreet = Happy;
    }

    /* public void setHgreet(String Happy){
	Hgreet = Happy;
    }
    */
    public String Sgree(String name){
	String message;
	message = Sgreet + " " + name;
	return message;	
    }

    public String Hgree(String name){
	String message;
	message = Hgreet + " " + name;
>>>>>>> 469aebf2a556c17873a9719397ffc4b3b8e14cd6
	return message;
    }
}
