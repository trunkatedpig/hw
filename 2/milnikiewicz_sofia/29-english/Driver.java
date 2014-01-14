import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	c.buildCorpusFreq("twopoets.txt");
	
	System.out.println();
	System.out.println("Testing Vector Creator for Corpus:");
	System.out.println("Get e: " + c.getVect('e',c.CorpusFreqs,c.totalChars));
	System.out.println("Get a: " + c.getVect('a',c.CorpusFreqs,c.totalChars));

	System.out.println();
	System.out.println("Testing Vector Creator for Encoded String:");
	String s = "this is a test string mustache man i enjoy eating pasta in the rain";
	c.codeFreqs(s);
	System.out.println("Get i: " + c.getVect('i',c.freqs,c.total));

	System.out.println();
	System.out.println("Testing Decryption Cracker:");
	String encryption = c.encode(s,3);
	System.out.println(encryption);
	System.out.println(c.cracker(encryption));
	System.out.println();
    }
}
