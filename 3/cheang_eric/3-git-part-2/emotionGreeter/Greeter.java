import java.io.*;
import java.util.*;

public class Greeter {
    
    private String happyGreeting, sadGreeting;
    
    public Greeter() {
	happyGreeting = "Hello, can you help me with my APCS homework ";
	sadGreeting = "Man I hate this APCS homework ";
	
    }
    
    public String happySentenceCreation(String Name){

	String completedSentence;
        completedSentence = happyGreeting + Name;
	return completedSentence;

	    } 
    
    public String sadSentenceCreation(String Name){
	
	String completedSentence;
	completedSentence = sadGreeting + Name;
	return completedSentence;
	    } 
    
    
    


    


}

