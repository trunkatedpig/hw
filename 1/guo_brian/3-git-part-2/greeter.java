import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting, sadgreeting;
    
    public Greeter() {
	setHappy("Nice to meet you!");
	setSad("It is a rather solemn occasion");
    }
    
    public setHappy(String happygreeter){
	happygreeting = happygreeter;
    }

    public setSad (String sadgreeter){
	sadgreeting = sadgreeter;
    }

    public Greeter(String happy, String sad){
	happygreeting = happy;
	sadgreeting = sad;
    }

    public String happygreet (String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadgreet (String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}