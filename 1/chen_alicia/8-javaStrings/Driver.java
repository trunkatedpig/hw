import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	StringStuff s = new StringStuff();
	System.out.println (s.capitalize("alicia chen"));
	System.out.println(s.bondify ("Alicia Chen"));
	System.out.println (s.piglatinify ("first"));
	System.out.println(s.piglatinify ("owl"));
	System.out.println(s.piglatinify ("chat"));
    }
}
