import java.io.*;
import java.util.*;   

public class Driver {
    
    public static void main(String args[]) {
	Cipher c = new Cipher();
	
	c.buildCorpusFreq("Taming_of_the_Shrew.txt");
	System.out.println(Arrays.toString(c.getCorpusFreq()));
    }
}
