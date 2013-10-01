import java.io.*;
import java.util.*;

public class Greeter {
    public String HappyGreeting;
    public String SadGreeting;
    
    public Greeter(){
	setHappy("Hey what's up?");
        setSad("Get out of here");
        }
        
    public Greeter(String happy, String sad){
    	setHappy(happy);
    	setSad(sad);
    }
    
    public void setHappy(String H) {
	HappyGreeting=H;
    }
    
    public void setSad(String S) {
	SadGreeting=S;
    }

    public String HappyGreet(String nameH) {
	String messageH;
	messageH = HappyGreeting + " " + nameH;
	return messageH;
    }

    public String SadGreet(String nameS) {
	String messageS;
	messageS = SadGreeting + " " + nameS;
	return messageS;
    }

}
