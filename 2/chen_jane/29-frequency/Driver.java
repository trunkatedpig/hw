import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	c.buildCorpusFreq("twopoets.txt");
	System.out.println(c.getVect('e',c.CorpusFreqs,c.totalChars));
	System.out.println(c.getVect('a',c.CorpusFreqs,c.totalChars));

	String s = "this is a test string mustache man i enjoy eating pasta in the rain";

	c.codeFreqs(s);
	System.out.println(c.getVect('i',c.freqs,c.total));

	String encryption = c.encode(s,3);
	System.out.println(encryption);
	System.out.println(c.cracker(encryption));
    }
}
