import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println("Hello my name is Claire (5):"+ c.encode("Hello my name is Claire",5));
	System.out.println("Zebra (10):" + c.encode("Zebra",10));
    }
}
