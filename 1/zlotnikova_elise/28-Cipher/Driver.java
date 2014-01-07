import java.io.*;
import java.util.*;

public class Driver { 
    public static void main(String[] args) { 
	Cipher c = new Cipher();
	System.out.println(c.encode("hello!!",1));
	System.out.println(c.encode("HELLO!!!",27));
    }
}
