import java.io.*;
import java.util.*;

public class Greeter {
    private String happy, sad;
    public Greeter(){
	happy = "Howdy";
	sad = "Get lost";
    }
    public Greeter(String h, String s){
	happy = h;
	sad = s;
    }
    public void setHappy(String h){
	happy = h;
    }
    public void setSad(String s){
	sad = s;
    }
    public String happyGreet(String name){
	String message;
	message = happy + ", " + name + "!";
	return message;
    }

    public String sadGreet(String name){
	String message;
	message = sad + ", " + name + "!";
	return message;
    }
}