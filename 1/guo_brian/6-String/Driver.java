import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args) {
	StringStuff g = new StringStuff();
	g.alpha = "brian guo";
	String a = g.capitalize(g.alpha);
	System.out.println(a);
	System.out.println(g.bondify(a));
    }
}