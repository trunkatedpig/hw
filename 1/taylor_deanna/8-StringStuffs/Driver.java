import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Stringstuff s;
	String given, given2, given3, given4, given5, given6;
	given = "deanna taylor";
	given2 = "austen paris";
	given3 = "Hello";
	given4 = "champions";
	given5 = "Salmon";
	given6 = "apricot";
	s = new Stringstuff();
    
	System.out.println(s.capitalize(given));
	System.out.println(s.capitalize(given2));
      	System.out.println(s.bondify(given));
	System.out.println(s.bondify(given2));
	System.out.println(s.piglatinify(given3));
	System.out.println(s.piglatinify(given4));
	System.out.println(s.piglatinify(given5));
	System.out.println(s.piglatinify(given6));
    }
}
