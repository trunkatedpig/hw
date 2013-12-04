public class Coding {
    public boolean sameStarChar (String str) {
	boolean e = true;
	
	for (int i = 1; i < str.length()-1; i = i + 1) {
	    String a, b, c;
	    a = str.substring(i, i+1);
	    b = str.substring(i-1, i);
	    c = str.substring(i+1, i+2);
	    
	    if (a.equals("*")) {
		if (b.equals(c))
		    e = true;
		else
		    e = false;
	    }
	}
	return e;
    }

    public String sameEnds (String s) {
	int y = s.length();
	String str;
	str = "";

	for (int x = 1; x+x <= y; x = x + 1) {
	    String a,b;
	    a = s.substring(0, x);
	    b = s.substring(y-x, y);

	    if (a.equals(b)) {
		str = a;
	    }
	}
	
	return str;
    }
}
	
