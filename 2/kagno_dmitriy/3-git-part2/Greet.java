import java.io.*;
import java.util.*;

public class Greet {

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
	return message;
    }
}
