
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
Greeter g, g2, g3;
String result;
	g = new greeter();
	
	g.setHappy("I LOVE YOU");
	g.setSad(“I’m breaking up with you”);
	result = g.happygreet(“Tom”);
	system.out.println(result);
	result = g.sadgreet(“Mary”);
	system.out.println(result);


g2 = new greeter();
	result = g.happygreet(“Frank”);
	system.out.println(result);
	result = g.sadgreet(“Rachel”);
	system.out.println(result);




g3 = new greeter(“I love your tie”, “You’re ugly”);
result = g.happygreet(“Ezra”);
system.out.println(result);
	result = g.sadgreet(“Natalie”);
	system.out.println(result);



    }
}

	
