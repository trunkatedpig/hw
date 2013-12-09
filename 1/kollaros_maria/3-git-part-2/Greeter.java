import java.io.*;
import java.util.*;

public class Greeter {

    private String greeting;
    private String happygreeting;
    private String sadgreeting;
    public Greeter() {
	happygreeting = "What's up";
	sadgreeting = "I don't want to talk";
    }

    public Greeter(String a, String b) {
	happygreeting = a;
	sadgreeting = b;
    }

    public void sethappy(String arg) {
	happygreeting = arg;
    }

    public void setsad(String arg) {
	sadgreeting = arg;
    }

    /* Worked with Justin Weltz up until here and the rest I took from him from github so that I could understand the code, since I am having a really hard time */

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
