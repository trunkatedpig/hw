import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g;
	g = new Greeter();
	g.setHappy("How art thou sir");
	g.setSad("You're a butthead");
	System.out.println(g.greetHappy("Alex"));
	System.out.println(g.greetSad("Nick"));
    }

}
