import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String args[ ]) {
	StringStuff ss;
	String name1;
	ss = new StringStuff("stone moore");
	name1 = ss.getName();
	System.out.println(ss.capitalize(name1));
	System.out.println(ss.bondify(name1));
    }
}
