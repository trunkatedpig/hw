import java.io.*;
import java.util.*;

public class Greeter {
 
    private String happygreeting;

    private String sadgreeting;

    public Greeter() {
	 setHappy("Youre so great at CS");
	 setSad("I hope you get a lot of erros in your code");
    }
    
    public Greeter (String g1, String g2) {
	setHappy(g1);
	setGreeting(g2);
    }

    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad(String greet) {
	sadgreeting = greet;
    } 
  
    public String happyGreet(String name) {
	String message;
	message=happygreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message=sadgreeting + " " + name;
	return message;
    }
}
    


}
