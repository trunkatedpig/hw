import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting,sadgreeting;

    public Greeter(){
	setHappy("Why hello there");
	setSad("Get outta my face"); 
    }

    public Greeter (String happy, String sad){
	setHappy(happy);
	setSad(sad);
    }

    public void setHappy(String happy){
	happygreeting=happy;
    }

    public void setSad(String sad){
	sadgreeting=sad;
    }

    public String happyGreet (String name){ 

	/*Don't understand where you get happyGreet from */

	String message;
	message=happygreeting + " " + name;
	return message;
    }
    public String sadGreet (String name){
	String message;
	message=sadgreeting + " " + name;
	return message;
    }
}


/*Got a little inspiration from everyone when I hit dead ends. Still a little confused though */

  




   
   
