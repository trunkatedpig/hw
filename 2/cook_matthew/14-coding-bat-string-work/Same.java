import java.io.*;
import java.util.*;

public class Same {
    public boolean sameStarChar(String str) {
	int z=0;
	while (z <(str.length())) {
	    if (str.substring(z,z+1).equals("*")){
		if (z==0 || z==(str.length()-1)) {
		    z++;
		}
		else if (str.substring(z-1,z).equals(str.substring(z+1,z+2))) {
		    z++;
		}
		else {
		    return false;
		}
	    }
	    else {
		z++;
	    }
	}
	return true;
    }
    public String sameEnds(String string) {
	String s="";
	int m=string.length();
	for (int q=0; q<=m/2; q++) {
	    if (string.substring(0,q).equals(string.substring(m-q,m))) {
		s=string.substring(0,q);
	    }
	}
	return s;
    }
}