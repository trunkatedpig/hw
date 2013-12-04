import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Greeter g, g2;
	g = new Greeter();
	g2 = new Greeter("Hiya", "Get outta here");
	System.out.println(g.happyGreet("Aldric"));
	System.out.println(g.sadGreet("Rico"));
	System.out.println(g2.happyGreet("Mama"));
	System.out.println(g2.sadGreet("Rico"));
    }
}

		 