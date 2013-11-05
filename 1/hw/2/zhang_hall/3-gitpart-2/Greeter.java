import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting;
    public String sadgreeting;

    public Greeter(){
	happygreeting = "Heyo";
	sadgreeting = "I do not wish to speak to you";
    }

    public Greeter(String happy,String sad) {
	happygreeting = happy;
	sadgreeting = sad;
    }

    public void setHappy(String happy) {
	happygreeting = happy;
    }

    public void setSad(String sad) {
	sadgreeting = sad;
    }

    public String happyGreet(String name) {
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
