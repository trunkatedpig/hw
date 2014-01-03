import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	fontSwap f = new fontSwap();
	System.out.println(f.encode("hello",3));
	System.out.println(f.encode("abcxyz",3));
	System.out.println(f.encode("hi there!",1));
    }
}