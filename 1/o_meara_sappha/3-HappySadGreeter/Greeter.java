import java.io.*;
import java.util.*;

public class Greeter {
    public String HappyGreeting;
    public String SadGreeting;
    
    public Greeter(){
	setHappy("Happy");
        setSad("Sad");
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
