import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
    	Cipher c = new Cipher(); 

    	System.out.println("Encoding 'abcdef' with offset 1, result should be 'bcdefg'");
    	System.out.println(c.encode("abcdef", 1));

    	System.out.println("Encoding 'foo' with offset 26, result should be 'foo'");
    	System.out.println(c.encode("foo", 26));

    	System.out.println("Encoding 'foo!' with offset 27, result should be 'gpp!'");
    	System.out.println(c.encode("foo!", 27));

    	System.out.println("Encoding 'FOO!' with offset 27, result should be 'GPP!'");
    	System.out.println(c.encode("FOO!", 27));

        c.buildCorpusFreq("dickens.txt");
        c.printCorpusFreqs();
    }
}
