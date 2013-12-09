import java.io.*;
import java.util.*;

public class Greeter {
private String greeting;
    private string happyGreeting;
    private string sadGreeting;
    public Greeter( String HappyGreeter,String SadGreeter){
	setHappyGreeter(happygreeter);
	setSadGreeter(sadgreeter);
    }

    public Greeter(){
	setHappyGreeter("Friend!");
	setSadGreeter("Boo")}
    public void setHappyGreeter(String greet){
	happyGreeting = greet;
    }
	/* I didn't quite understand why it has to be designated as a String in the      parameters but it wasn't running and I deduced from stack overflow that it should be added
    public void setSadGreeter(String greet){
	sadGreeting = greet;
    } 
    public String happyGreet(String name) {
	String message;
	message = happyGreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadGreeting  + " " + name;
	return message;
    }

}