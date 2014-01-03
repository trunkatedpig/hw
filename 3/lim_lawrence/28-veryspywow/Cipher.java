public class Cipher {
    public boolean isLetter(char c) {
	return ((c>='a' && c<='z') || (c>='A' && c<='Z'));
    }
    public String caesarShift(String s, int n) {
	int offset = n%26;
	String r = "";
	char c;
	for (int i=0; i<s.length(); i++) {
	    c = s.charAt(i);
	    if (isLetter(c)) {
		if (isLetter((char)(c+offset)))
		    r+=(char)(c+offset);
		else
		    r+=(char)(c+offset-26);
	    } else {
		r+=c;
	    }
	}
	return r;
    }
}
