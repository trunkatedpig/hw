import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	StringStuff s;
	s = new StringStuff();
	System.out.println(s.capitalize("rebecca yuste"));
	System.out.println(s.bondify("rebecca yuste"));
	System.out.println(s.piglatinify("apple"));
	System.out.println(s.piglatinify("car"));
    }
}
