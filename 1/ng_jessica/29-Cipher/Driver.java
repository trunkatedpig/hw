import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

	
	Caesar julius = new Caesar ();

	String t = (julius.caesar ("hello", 3));
	System.out.println (t);
	System.out.println (julius.decode (t, 3));
	
	String s = (julius.caesar ("yolo", 20));
	System.out.println (s);
	System.out.println (julius.decode (s, 20));

	System.out.println (julius.decode ("hoorah", 28));
	

	julius.buildCorpusFreq("text.txt");
    }
}
