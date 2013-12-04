import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Stuff s;
	s = new Stuff();
	
	System.out.println(s.diag(0)); //""
	System.out.println(s.diag(4));
	System.out.println(s.diagWord("Hello"));
	System.out.println(s.diagWord("Hello World"));
	System.out.println(s.fence(0,5)); //""
	System.out.println(s.fence(7,5)); 
    }
}
