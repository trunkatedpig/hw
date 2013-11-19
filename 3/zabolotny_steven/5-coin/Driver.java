import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
Coin c;
c = new Coin();
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
    }
}