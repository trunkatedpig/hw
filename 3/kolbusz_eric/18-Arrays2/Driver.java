import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Arrays a = new Arrays();

	System.out.println(a.stringify(a.Revfill(0)));
	System.out.println(a.stringify(a.Revfill(6)));
	
	System.out.println(a.stringify(a.makeRandom(6,0,100)));
	System.out.println(a.stringify(a.makeRandom(20,5,6)));
    }
}
