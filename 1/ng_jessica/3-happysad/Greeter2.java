import java.io.*; 
import java.util.*; 

public class Greeter2 {
    
    private String happygreeting; 
    private String sadgreeting; 

    public void setup () {
	happygreeting = "Greetings Earthlings!";
	sadgreeting = "Fairest and Fallen, Greetings and Defiance!";
    }

    public void setGreet (String a, String b) {
	happygreeting = a; 
	sadgreeting = b; 
    }

    public String happyGreet () {
	return happygreeting; 
    }

    public String sadGreet () {
	return sadgreeting; 
    }

}
