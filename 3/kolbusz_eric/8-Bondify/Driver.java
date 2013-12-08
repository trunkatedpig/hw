import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s;
	s = new StringStuff();
     
	String n1,n2,n3;
	n1 = new String ("james bond");
	n2 = new String ("JacobVera");
	n3 = new String ("mikezamansky");
	
	
	System.out.println(s.bondify(s.capitalize(n1))); //Bond, James Bond
	System.out.println(s.bondify(n2)); //Invalid input.
	System.out.println(s.capitalize(n3)); //Invalid input.
    }
}
