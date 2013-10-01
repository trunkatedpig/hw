import java.io.*;
import java.util.*;

public class Greeter {

    private String happy,sad;

    public Greeter(){
	setHappy("sup");
	setSad("up yours");
    }
    public Greeter(String h, String s){
	setHappy(h);
	setSad(s);
    }
    
    public String getHappy(String name){
	return happy+" "+name;
    }
    public String getSad(String name){
	return sad+" "+name;
    }
    public void setHappy(String greet) {
	happy = greet;
    }
    public void setSad(String greet){
	sad=greet;
    }

   
}
