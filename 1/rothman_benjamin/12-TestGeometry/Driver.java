import java.util.*;
import java.io.*;

public class Driver {

    public static void main (String [] args ) {

	Geometry g = new Geometry ();

	System.out.println (g.diag (0) );
	System.out.println (g.diag (5) );
	System.out.println (g.diag (7) );

	Geometry f = new Geometry ();

	System.out.println (f.diagWord ("Hello") );

	Geometry z = new Geometry ();

	System.out.println (z.fence (5, 3) );
	System.out.println (z.fence (10,5) );
	System.out.println (z.fence (5, 12) );
	System.out.println (z.fence (1,2) );

    }

}
