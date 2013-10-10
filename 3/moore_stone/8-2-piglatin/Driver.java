import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String args[ ]) {
	StringStuff ss1,ss2,ss3;
	String name1,word1,word2;
	ss1 = new StringStuff("stone moore");
	name1 = ss1.getWord();
	System.out.println(ss1.capitalize(name1));
	System.out.println(ss1.bondify(name1));
	ss2 = new StringStuff("test");
	word1 = ss2.getWord();
	System.out.println(ss2.pigLatinify(word1));
	ss3 = new StringStuff("animal");
	word2 = ss3.getWord();
	System.out.println(ss3.pigLatinify(word2));
    }
}
