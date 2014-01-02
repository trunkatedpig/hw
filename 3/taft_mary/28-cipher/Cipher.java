import java.util.*;

public class Cipher {

    public String encode(String s, int i) {
	s.toLowerCase();
	char[] ca = s.toCharArray();
        for(int k=0; k<ca.length; k++) {
	    int j = i;
	    while(j>0) {
		if (ca[k]==122)
		    ca[k] = 'a';
		else
		    ca[k]++;
		j--;
	    }
	}
	return new String(ca);
    }

}
