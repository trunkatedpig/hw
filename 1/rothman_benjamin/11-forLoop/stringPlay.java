import java.io.*;
import java.util.*;

public class stringPlay {

    private String reversed;
    private String tabler;
    private int length;
    private int i;
    private int e;
    private int o;

    public String Reverse (String s) {

	reversed = ""; //so as not to input null later on.



for (i = s.length (); i > 0 ; i-- ) {

	    

    reversed = reversed +  s.substring (i-1, i);

	}

	return reversed;

    }



    public String table ( int n, int m ) {

	tabler = " ";

	for (i = 1; i <= n; i++ ) {

	    tabler = tabler + " " + i;

	}

	tabler = tabler + "\n";

	for (e = 1; e <= m; e++) {

	    tabler = tabler + e + " ";


	for (o = 1; o <= n; o++) {

	    tabler = tabler + (e * o) + " ";

	}

	    tabler = tabler + "\n";

	}

	

	return tabler;

    }

}
	   

				    


