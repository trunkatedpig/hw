import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Greeter g;
	String result;

	g = new Greeter("such a lovely day,", "go away");
	System.out.println(g.greet("Ishmam"));
    }
}
