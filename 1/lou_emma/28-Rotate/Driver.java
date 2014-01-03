import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String[] args){
	Cipher c = new Cipher();

	System.out.println(c.encode("hello", 3)); //should print "khoor"
	System.out.println(c.encode ("abcxyz", 3)); //should print "defabc"
	System.out.println(c.encode("hi there!", 1)); //should print "ij uifsf!"
	System.out.println(c.encode ("abcxyz", -3)); //should print "xyzuvw"
    }
}
