import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting;
    public String sadgreeting;
    
    public Greeter(){
	sethappy("I'm happy,");
	setsad("I'm sad,");}

    public void sethappy (String h){
	happygreeting=h;}

    public void setsad (String s){
	sadgreeting=s;}

    public String happygreet(String name1) {
	String message1;
	message1 = happygreeting + " " + name1;
	return message1;
    }

    public String sadgreet(String name2){
	String message2;
	message2=sadgreeting+" "+name2;
	return message2;
    }

    public Greeter(String happy, String sad){
	sethappy(happy);
	setsad(sad);
    }



}
