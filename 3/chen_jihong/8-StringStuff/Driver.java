import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args) {
	Stringstuff s = new Stringstuff();
	s.string = "david chen";
	String a = s.capitalize(s.string);
	System.out.println(a);
	System.out.println(s.bondify(a));
    }
}