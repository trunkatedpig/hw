import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;
    
    public Greeter() {
	happygreeting = "Hello there";
	sadgreeting = "Leave";
    }
    
    public Greeter(String s1, String s2) {
	happygreeting = s1;
	sadgreeting = s2;
    }

    public void setHappy(String s) {
	happygreeting = s;
    }
    
    public void setSad(String s) {
	sadgreeting = s;
    }

    public String happyGreet(String s) {
	return happygreeting + " " + s;
    }

    public String sadGreet(String s) {
	return sadgreeting + " " + s;
    }

}
