import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Encryption c = new Encryption();
	System.out.println(c.shift("willitwork",1));
	System.out.println(c.shift("whataboutnow",24));
	System.out.println(c.shift("repeat",26));
	System.out.println(c.shift("with spaces",13));
	System.out.println(c.shift("jvgu fcnprf",13));
	System.out.println(c.shift("exclamation!",8));
	System.out.println(c.shift("question mark?",16));
	System.out.println(c.shift("mfktiuibqwv!",18));
	System.out.println(c.shift("gkuijyed cqha?",10));
	System.out.println(c.shift("Upper Case!",16));
	System.out.println(c.shift("kffuh sqiu!",10));


    }
}
