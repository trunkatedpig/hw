import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Coin c1;
	
	c1 = new Coin();
	System.out.println(c1.getFace());
	System.out.println(c1.getFlips());
	c1.resetFlips();
	System.out.println(c1.getFlips());
    }
}
