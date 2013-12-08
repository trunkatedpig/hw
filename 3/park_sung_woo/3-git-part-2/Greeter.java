import java.io.*;
import java.util.*;

public class Greeter {
	private String happyGreeting;
        private String sadGreeting;

	public Greeter () {
            setHappyGreeting("Hello! It's such a nice day, ");
            setSadGreeting("I'm not feeling well today, ");
	}

        public Greeter (String sad,String happy){
            setHappyGreeting(happy);
            setSadGreeting(sad);
        }
        

	public void setHappyGreeting(String greet) {
	    happyGreeting = greet;
	}

        public void setSadGreeting(String greet) {
            sadGreeting = greet;    
        }

	public String happyGreet(String name) {
	    String message;
	    message = happyGreeting + name;
	    return message;
	}

        public String sadGreet(String name) {
            String message;
            message = sadGreeting + name;
            return message;
        }
}
