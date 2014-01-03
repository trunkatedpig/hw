import java.util.*;

public class Cipher {

    public String encode(String s, int i) {
	String s1 = s.toLowerCase();
	char[] ca = s1.toCharArray();
        for(int k=0; k<ca.length; k++) {
	    int j = i;
	    if (j>0) {
		while(j>0) {
		    if (ca[k]==122)
			ca[k] = 'a';
		    else if (ca[k]>=97&&ca[k]<122)
			ca[k]++;
		    j--;
		}
	    }
	    else {
		while(j<0) {
		    if (ca[k]==97)
			ca[k] = 'z';
		    else if (ca[k]>=97&&ca[k]<122)
			ca[k]--;
		    j++;
		      }
	    }
	}
	return new String(ca);
    }

}
