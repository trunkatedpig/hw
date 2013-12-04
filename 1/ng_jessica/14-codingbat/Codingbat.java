public boolean sameStarChar(String str) {
    boolean store;
    for (x = 1; x < str.length() - 1; x = x + 1) {
	if (str.substring(x, x+1) == "*") {
	    if (str.substring(x-1, x) == str.substring(x+1, x+ 2)) {
		store = True; 
	    }
	}
	else {
	    store = False;
	}
	return store;
    }
}


public String sameEnds(String string) {
    String store; 
    int a;
    a = string.length() - 1;
    for (x = 0; x < (a+1)*2; x = x + 1) {
	if (string.substring(0, x) == string.substring(a, string.length() -1)) {
	    store = string.substring(0,x);
	    a = a - 1;
	}
	else {
	    x = string.length() + 1;
	}
    }
    return store;
}
