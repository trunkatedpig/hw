import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	c.buildCorpusFreq("twopoets.txt");
	System.out.println(c.getFreq('e'));
	System.out.println(c.getFreq('a'));
	System.out.println(c.getFreq('t'));
	System.out.println(c.getFreq('x'));
	System.out.println(c.getFreq('z'));
    }
}
