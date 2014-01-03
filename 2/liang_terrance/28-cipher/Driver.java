import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
	Cipher c = new Cipher();
	System.out.println(c.rot("Hello!",13));
	System.out.println(c.rot("HELLO!",2));
	System.out.println(c.rot("hello!",13));
	System.out.println(c.rot("Terrance Liang",5));
	System.out.println(c.rot("Hello!",27));
	System.out.println(c.rot("Hello!",-5));
    }
}

