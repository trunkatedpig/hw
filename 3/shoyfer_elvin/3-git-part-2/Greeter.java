import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting, sadgreeting;

    public Greeter() {
        setHappy("Yooo");
        setSad("Go away");
    }

    public Greeter(String happy, String sad) {
        setHappy(happy);
        setSad(sad);
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
