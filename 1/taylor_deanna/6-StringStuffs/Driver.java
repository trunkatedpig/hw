import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Stringstuff s;
	String given, given2;
	given = "deanna taylor";
	given2 = "austen paris";
	s = new Stringstuff();
    
	System.out.println(s.capitalize(given));
	System.out.println(s.capitalize(given2));
      	System.out.println(s.bondify(given));
	System.out.println(s.bondify(given2));
    }
}
