public class Cipher {
    public String encode (String input, int shift) {
	shift = shift%26;
	input = input.toLowerCase();
	String output = "";
	for (int i=0;i<input.length();i++) {
	    int asc = (int) input.charAt(i);
	    if (96 < asc && 123 > asc) {
		asc+=shift;
		if (asc > 122)
		    asc = asc-26;
	    }
	    output+= (char)asc;
	}
	return output;
    }
}