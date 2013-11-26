import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;

    public Greeter(){
        setHappy("Hiya");
        setSad("Oh god, it's you. Don't talk to me");
    }

    public void setHappy(String name) {
        happygreeting = name;
    }
    public void setSad(String name) {
        sadgreeting = name;
    }

    public String happyGreet(String name) {
        String message;
        message = happygreeting + " " + name;
        return message;
    }
    public String sadGreet(String name) {
        String message;
        message = sadgreeting + " " + name;
        return message;
    }
}
