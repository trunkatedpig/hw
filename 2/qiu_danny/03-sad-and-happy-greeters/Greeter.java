import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting, sadgreeting;

    public Greeter() {
        setHappy("Welcome, almighty");
        setSad("We don't want you here,");
    }

    public Greeter(String h, String s) {
        setHappy(h);
        setSad(s);
    }

    public void setHappy(String happy) {
        happygreeting = happy;
    }

    public void setSad(String sad) {
        sadgreeting = sad;
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
