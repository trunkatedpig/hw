import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	coinGame a = new coinGame ();
	a.turn ();
	System.out.println ("pot: " + a.getPot ());
	System.out.println (a.getFaces());
	System.out.println (a.getBalances());
    }
}
