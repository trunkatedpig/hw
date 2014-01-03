public class Cipher {
    public String encode(String n,int r) {
	n = n.toLowerCase();
	char c = 0;
	int a = 0;
	for(int i = 0;i < n.length();i++) {
	    c = n.charAt(i);
	    a = (int)c;
	    if ((a > 96) && (a < 123)) {
		if (a < 123 - r)
		    a = a + r;
		else {
		    a = a + r - 122 + 96;
		}
	    }
	    n = n.substring(0,i) + (char)a + n.substring(i + 1);
	}
	return n;
    }
}