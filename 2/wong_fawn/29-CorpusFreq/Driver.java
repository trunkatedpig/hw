import java.io.*;
import java.util.*;

public class Driver {
	public static void main (String[] args) {
		Cipher c = new Cipher();
		System.out.println(c.rotate("ABCD",2));
		c.buildCorpusFreq("WarAndPeace");
		c.printCorpusFreqs();
	}
}