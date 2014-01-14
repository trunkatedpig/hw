import java.io.*;
import java.util.*;

public class Driver {
	public static void main (String[] args) {
		Cipher c = new Cipher();
		String s = c.rotate("I am very unhappy right now",5);
		System.out.println(s);
		c.buildCorpusFreq("WarAndPeace");
		c.printCorpusFreqs();
	}
}