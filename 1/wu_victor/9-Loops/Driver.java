import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops a = new Loops();
	Loops b = new Loops();
	Loops c = new Loops();

	System.out.println(a.fact(3));
	System.out.println(b.fact(5));
	System.out.println(c.fact(7));

	System.out.println(" ");
	System.out.println("--------------------");
	System.out.println(" ");

	System.out.println(a.fact2(3));
	System.out.println(b.fact2(5));
	System.out.println(c.fact2(7));
    }
}
