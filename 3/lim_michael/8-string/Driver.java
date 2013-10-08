import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff stuff = new StringStuff();
	String l1 = stuff.capitalize("michael lim");
	String l2 = stuff.bondify("lichael mim");
	System.out.println(l1);
	System.out.println(l2);
    }

}
