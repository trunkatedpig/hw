import java.io.*;
import java.util.*;

public class Greeter {

    private String happy,sad;
     
    public Greeter(String g, String h) {
	sadgreeting(g);
	happygreeting (h);
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
