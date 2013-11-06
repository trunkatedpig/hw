import java.util.*;
import java.io.*;

public class Geometry {

    private String diagonal;
    private String diagonal2;

    public String diag (int n) {

	diagonal = "";       

	 for (int i = 1; i <= n; i++) {

            diagonal = diagonal + "*" + "\n";

	    for (int e = 1; e <= i; e++ ) {

                diagonal = diagonal + " ";

	    }

        }

        return diagonal;

    }

    public String diagWord(String w) {

	diagonal2 = "";
	int t = w.length();

	for (int i = 0; i < t; i++) {
	    diagonal2 = diagonal2 + w.substring(i,(i+1)) + "\n";

	    for (int e = 0; e <= i; e++) {
		diagonal2 = diagonal2 + " ";
	    }
	}

	return diagonal2;

    }
}