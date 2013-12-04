import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s = new StringStuff();

	System.out.println(s.capitalize("isaac gluck"));
	System.out.println(s.bondify("isaac gluck"));
	System.out.println(s.piglatinify("thanks"));
	System.out.println(s.piglatinify("hello"));
	System.out.println(s.piglatinify("about"));
    }
}
