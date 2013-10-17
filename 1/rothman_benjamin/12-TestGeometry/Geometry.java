import java.util.*;
import java.io.*;

public class Geometry {

    private String diagonal;
    private String asterisk;



    public String diag (int n) {

	diagonal = "";
	asterisk = "*";

	for (int i = 1; i <= n; i++) {

	    diagonal = asterisk + "\n";

	    for (int e = 1; e <= i; e ++ ) {

		diagonal = diagonal + " ";

		 

	}

	}

	return diagonal;

    }

}