import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter a,b;
	String good, bad;
	
	a = new Greeter ();
	good = a.happyGreet ("Bob");
	bad = a.sadGreet ("Bobby");
	System.out.println (good);
	System.out.println (bad);

	b = new Greeter ("Welcome", "Go away");
	good = b.happyGreet ("Tom");
	bad = b.sadGreet ("Tommy");
	System.out.println (good);
	System.out.println (bad);
    }
}
