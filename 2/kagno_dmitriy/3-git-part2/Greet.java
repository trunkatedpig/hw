import java.io.*;
import java.util.*;

public class Greet {

    public String Sgreet,Hgreet;

    public Greet(String g,String h) {
	setSgreet(g,h);
    }

    public Greet(){
	setSgreet("Go away","Good Mornin'");
    }

    public void setSgreet(String Sad,String Happy){
	Sgreet = Sad;
	Hgreet = Happy;
    }

    /* public void setHgreet(String Happy){
	Hgreet = Happy;
    }
    */
    public String Sgree(String name){
	String message;
	message = Sgreet + " " + name;
	return message;	
    }

    public String Hgree(String name){
	String message;
	message = Hgreet + " " + name;
	return message;
    }
}
