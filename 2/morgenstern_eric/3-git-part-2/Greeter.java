import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting;
    public String sadgreeting;
   
    public void setSad (String greeter){
	sadgreeting = greeter;
    }
    public void  setHappy (String greeter){
	happygreeting = greeter;
    }
    public setgreetings() {
	setSad ("Getta outta here");
	setHappy ("HEY");
    }
    public setgreetings(String sad, String happy){
	setSad(sad);
	setHappy(happy);
    }
    public String sadGreet(String name){
	String finalproduct;
	finalproduct = sadgreeting + " " + name;
	return finalproduct;
    }
    public String happyGreet(String name){
	String finalproduct;
	finalproduct = happygreeting + " " + name;
	return finalproduct;
    }
}
