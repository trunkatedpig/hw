import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
        
        Cipher c = new Cipher();

        System.out.println(c.encode("hello", 3));
        System.out.println(c.encode("khoor", -3));
	System.out.println(c.encode("what is up", 1));
    }
}