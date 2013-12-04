public class forLoops {
    public int gcdfor(int a,int b) {
        for (int i = Math.min(a,b);i > 1;i = i - 1) {
            if (a%i == 0 && b%i == 0) {
                return i;
	    }
        }
        return 1;
    }
    public String reverse(String s) {
        String r = "";
	//Makes last character
	int i = s.length();
	r = r + s.substring(i);
	//Makes all the other characters (since substringing last character here wouldn't work.)
        for (i = i - 1;i >= 0;i = i - 1) {
            r = r + s.substring(i,i+1);
        }
	return r;
    }
    public String table(int n,int m) {
	String table = "   ";
	//Initializes the top row
	for (int nrow = 1;nrow <= n;nrow = nrow + 1) {
	    table = table + nrow + "  ";
	}
	table = table + "\n";
	//Peforms a cycle of multiplication for each row and column
	for (int mcol = 1;mcol <= m;mcol = mcol + 1) {
	    table = table + mcol + "  ";
	    for (int nrow = 1;nrow <= n;nrow = nrow + 1) {
		table = table + (nrow * mcol) + "  ";
	    }
	    table = table + "\n";
	}
	return table;
    }
}