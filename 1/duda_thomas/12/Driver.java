import java.util.*;
import java.io.*;

public class Driver {

    public static void main (String [] args ) {

        Geometry g = new Geometry ();

        System.out.println (g.diag (0) );
        System.out.println (g.diag (5) );
        System.out.println (g.diag (7) );
	System.out.println (g.diagWord ("yes") );
	System.out.println (g.diagWord ("hello") );

	}


}