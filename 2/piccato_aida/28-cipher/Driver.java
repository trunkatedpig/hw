import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Cipher cipher = new Cipher();
        cipher.buildCorpusFreq("pg1400.txt");
	System.out.println("Reference Vector: " + cipher.buildReferenceVector());
	String code = cipher.encode("this is a test to try out my code", 3);
	System.out.println(cipher.buildVector(code));
	
    }
}
