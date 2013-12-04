import java.io.*;
import java.util.*;

public class StringTests {

    private String star;
    private String same;
    private int length;

public boolean sameStarChar (String str) {

    star = str;

    if ( star.indexOf ("*") == -1) {

	return true;

    }

    else {

	while (star.indexOf ("*") != -1) {

	    if (star.indexOf ("*") == 0) {

		star = star.substring (1);

	    }

	    else {
		if  (star.substring (star.indexOf ("*") - 1, star.indexOf ("*")).equals (star.substring (star.indexOf ("*") + 1, star.indexOf ("*") + 2 ) ) ) {

		star = star.substring (1);

	    }

	    else {

		return false;

	    }

		}

	    }
    
	return true;

    }

}


    public String sameEnds (String string) {

	same = string;
	length = same.length();

	if (length % 2 == 0) {

	    int w = length / 2;
	    
	    for (int i = length / 2; i > 0; i--) {
	        

		if (same.substring (0, i).equals (same.substring (w, length ) )) {

		    return (same.substring (0, i) );

		}

		w = w + 1;

	    }

	    return "NOPE, NO MATCHES HERE. TRY MYLIFEISADISAPPOINTMENT.COM";

	}


	else {

	    int w = (length + 1) / 2;

	    for (int i = (length - 1) / 2; i > 0; i --) {

	        

		if (same.substring (0,i).equals (same.substring (w, length) )) {

			return same.substring (0,i);

		    }

		    w = w + 1;
	    }

	    return "SO CLOSE. OH WAIT, IT WASN'T. GG MATE, YOU FAILED";

	}

    }
		    
		    

		    

	    

}
