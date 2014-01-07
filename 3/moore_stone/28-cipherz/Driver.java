import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Code c = new Code();
	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
	System.out.println(c.encode("dog",7));
    }
}
