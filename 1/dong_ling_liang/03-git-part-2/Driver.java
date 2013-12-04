import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g1 = new Greeter();
	System.out.println(g1.happyGreet("Lee"));
	System.out.println(g1.sadGreet("Lee"));

	Greeter g2 = new Greeter("Yay","Ew");
	System.out.println(g2.happyGreet("Peke"));
	System.out.println(g2.sadGreet("Peke"));
    }
}
