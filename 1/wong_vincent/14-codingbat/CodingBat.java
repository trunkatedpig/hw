public String sameEnds(String string) {
    int y = string.length();
    String s = "";

    for (int x=1;2*x<=y;x=x+1) {
	String a,b;
	a = string.substring(0,x);
	b = string.substring(y-x,y);
	
	if(a.equals(b)) {
	    s = a; //or s = b;
	}
    }
    return s;
}

public boolean sameStarChar (String str) {
    boolean z = true;

    for (int i = 1; i < str.length()-1; i = i + 1) {
	String a,b,c;
	a = str.substring(i-1, i);
	b = str.substring(i, i+1);
	c = str.substring(i+1, i+2);

	if (b.equals("*")) {
	    if (a.equals(c))
		z = true;
	    else
		z = false;
	}
    }
    return z;
}
