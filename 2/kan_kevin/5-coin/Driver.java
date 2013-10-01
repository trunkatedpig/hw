import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
	Coin x = new Coin();
	System.out.println(x.getFace());
	System.out.println(x.getFlips());

	x.resetCount();
	System.out.println(x.getFlips());

    }
}
