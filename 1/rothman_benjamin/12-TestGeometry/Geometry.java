import java.util.*;
import java.io.*;

public class Geometry {

    private String diagonal;
<<<<<<< HEAD
=======
    private String asterisk;
    private String fencer;


>>>>>>> 48a102705269d532ee436cc0bb1b839206d21d23

    public String diag (int n) {

	for (int i = 1; i <= n; i++) {

<<<<<<< HEAD
	    diagonal = "*" + "\n";

	    /*	    for (int e = 0; e <= i; e++ ) {
=======

	    for (int e = 1; e < i; e ++ ) {
>>>>>>> 48a102705269d532ee436cc0bb1b839206d21d23

		diagonal = diagonal + " ";

		 

		}*/

	    diagonal = diagonal + asterisk + "\n";

	}

	return diagonal;

    }


    public String diagWord (String w) {

	diagonal ="";

	for (int i = 0; i < w.length (); i ++ ) {

	    for (int a = 0; a < i; a++ ) {

		diagonal = diagonal + " ";

	    }


	    diagonal = diagonal + w.substring (i, i+1) + "\n";

	}
	return diagonal;
    }




    public String fence (int h, int w) {



	if (h < 2 || w < 2) {

	    return "YOU LOSE THE GAME OF LIFE";

	}

	else {

	fencer = "+";


	for (int i = 1; i < (h-1); i++ ) {

	    fencer = fencer + "-";

	}

	fencer = fencer + "+" + "\n";

	for (int a = 1; a < (w-1); a++) {

	    fencer = fencer + "|";

		for (int b = 1; b < (h-1); b++) {

		    fencer = fencer + " ";

		}

		fencer = fencer + "|" + "\n";

	}
	fencer = fencer + "+";

	for (int p = 1; p < (h-1); p++) {

	    fencer = fencer + "-";

	}

	fencer = fencer + "+";

	return fencer;

    }

    }
}

					       
	

