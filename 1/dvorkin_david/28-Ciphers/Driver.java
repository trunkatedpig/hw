import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Cipher word = new Cipher();
	System.out.println(word.encode("hello", 3));
	System.out.println(word.encode("abcxyz", 3));
    }
}
