import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("andrew lee"));
	System.out.println(s.bondify("andrew lee"));
	System.out.println(s.pigLatinify("Hello"));
	System.out.println(s.pigLatinify("Apple"));
    }
}