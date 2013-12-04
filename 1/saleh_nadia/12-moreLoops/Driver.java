import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Lupz z = new Lupz ();
	System.out.println (z.diag(6));
	System.out.println (z.diagWord ("danjongen"));
	System.out.println (z.fence (6,4));
    }
}
