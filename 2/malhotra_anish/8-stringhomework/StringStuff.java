import java.io.*;
import java.util.*;

public class StringStuff {

    public String stringCap(String n) {
        String temp;
        int index;
        temp = n.substring(0,1).toUpperCase();
        index = n.indexOf(" ");
        temp = temp + n.substring(1,index + 1);
        temp = temp + n.substring(index + 1,index + 2).toUpperCase();
        temp = temp + n.substring(index + 2);
        return temp;
    }

    public String bondify(String n) {
	String temp;
	String first;
	String last;
	int index;

	/*temp = n.substring(0,1).toUpperCase();

	index = n.indexOf(" ");

	first = temp + n.substring(1,index + 1);

	temp = n.substring(index + 1,index + 2).toUpperCase();
	last = temp + n.substring(index + 2);*/

	/* *************************************************** */
	temp = StringStuff.stringCap(n);

	index = n.indexOf(" ");

	first = temp.substring(0,index + 1);

	last = temp.substring(index + 1);

	temp = last +  ", " + first + last;

	return temp;
    }
}
