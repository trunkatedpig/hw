import java.util.*;
import java.io.*;

public class Greeter {
    public String greet() {
	String greeting;
	String s1,s2;

	s1 = new String("Hello");
	s2 = "World!"; 

	greeting = s1 + " " + s2;
	return greeting;
    }
}
