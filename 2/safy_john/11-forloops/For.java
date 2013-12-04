public class For {
    public int fact2 (int n) {
	int f = 1;
	for (; n > 0; n --) {
	    f = f * n;
	}
	return f;
    }

    public String reverse (String S) {
	String gnirts = new String();
	for (int l = 0; l != S.length(); l ++) {
	    gnirts = S.substring (l, l + 1) + gnirts;
	}
	return gnirts;
    }

    public String table (int n, int m) {
	//No clue
    }
}


