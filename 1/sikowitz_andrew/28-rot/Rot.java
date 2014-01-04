public class Rot {
    public String encode(String str, int offset) {
        String s = "";

	str = str.toLowerCase();
	if (offset < 0)
	    offset = offset + 26;

	for (int i=0; i<str.length(); i++) {
	    s += rotate(str.charAt(i), offset);
	}

	return s;
    }
    
    public char rotate(char c, int offset) {
	if (c >= 97 && c <= 122)
	    c = (char) ((int)c + offset);
        if (c > 122)
	    c = (char) ((int)c - 26);
	
	return c;
    }
}
