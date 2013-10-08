import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s1, s2;
	s1 = new StringStuff("timothy diep");
	s2 = new StringStuff("mike zamansky");
	System.out.println(s1.capitalize());
	System.out.println(s1.bondify());
	System.out.println(s2.capitalize());
	System.out.println(s2.bondify());
    }
}
