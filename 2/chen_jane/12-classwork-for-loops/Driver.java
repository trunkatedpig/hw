import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] arg) {
	Forprac f;
	f = new Forprac();

	System.out.println(f.diag(5));
	System.out.println(f.diag(9));
	System.out.println(f.diagWord("String"));
	System.out.println(f.diagWord("staircase"));
	System.out.println(f.fence(5,8));
	System.out.println(f.fence(2,2));
	System.out.println(f.fence(10,2));

    }
}
