import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
	Cipher c = new Cipher();
	System.out.println(c.Encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3));
	System.out.println(c.Encode("Hello There!", 1));
    }
}
