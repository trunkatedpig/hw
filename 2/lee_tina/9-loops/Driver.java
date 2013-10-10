import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Loops a,b,c,d;
	a = new Loops();
	b = new Loops();
	c = new Loops();
	d = new Loops();
	System.out.println(a.fact(4));
	System.out.println(b.fact(5));
	System.out.println(c.fact2(4));
	System.out.println(d.fact2(5));
    }
}
