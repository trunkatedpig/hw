import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable                                   
       when we declare it like this: */                                         

    private String happy,sad;

    public void setHappy(String message) {
	happy = message;
    }

    public String greetHappy(String name) {
	return happy + " " + name;
    }

    public void setSad(String message) {
	sad = message;
    }

    public String greetSad(String name) {
	return sad + " " + name;
    }
   
}