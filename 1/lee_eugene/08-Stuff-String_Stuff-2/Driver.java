import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s = new StringStuff();
        System.out.println("Capitalize: " + s.capitalize("eugene lee"));
        System.out.println("Bondify: " + s.bondify("eugene lee"));

	System.out.println("How does pig latin work?");
	System.out.println("The term pig latin piglatinized is "+s.pigLatinfy("pig")+" "+s.pigLatinfy("latin")+".");
    }
}