import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	//testing out the code//
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("beef stew"));
	System.out.println(s.capitalize("chicken poo"));

	System.out.println(s.bondify("Tyler Wang"));
	System.out.println(s.bondify("Brian Guo"));

	//flaws still present in the code//
	StringStuff s1 = new StringStuff();
	System.out.println(s1.capitalize("elise spider-queen"));
	System.out.println(s1.bondify("Tianshi Wang Jr."));
			   
    }
}
