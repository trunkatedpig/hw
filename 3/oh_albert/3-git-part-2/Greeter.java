import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;

    public Greeter() {
	setHappy("I missed you");
	setSad("I don't like you");
    }

    public void setHappy (String happy) {
	happygreeting=happy;
    }

    public void setSad (String sad) {
	sadgreeting=sad;
    }

    public String happyGreet (String name) {
	String message;
	message=happygreeting + " " + name;
	return message;
    }

     public String sadGreet (String name) {
	String message;
	message=sadgreeting + " " + name;
	return message;
    }

}
