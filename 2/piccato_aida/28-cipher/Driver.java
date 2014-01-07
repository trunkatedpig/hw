import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Cipher cipher = new Cipher();
        cipher.buildCorpusFreq("pg1400.txt");
	System.out.println(cipher.getFreq('a'));
	System.out.println(cipher.getFreq('e'));
	System.out.println(cipher.getFreq('y'));
	System.out.println(cipher.getFreq('z'));
    }
}
