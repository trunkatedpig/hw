import java.util.*;

public class Cipher {

    public String encode(String s, int i) {
	String s1 = s.toLowerCase();
	char[] ca = s1.toCharArray();
        for(int k=0; k<ca.length; k++) {
	    int j = i%26;
	    if (i>0) {
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

    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println("\"abc\" shifted by 2: " + c.encode("abc",2));
	System.out.println("\"xyz\" shifted by 3: " + c.encode("xyz",3));
	System.out.println("\"Testing Capitals and Symbols.\" shifted by 1: " + c.encode("Testing Capitals and Symbols.",1));
	System.out.println("\"backwards\" shifted by -1: " + c.encode("backwards",-1));
	System.out.println("\"over 26\" shifted by 33: " + c.encode("over 26", 33));
	System.out.println("\"under -26\" shifted by -33: " + c.encode("under -26", -33));
    }

}
