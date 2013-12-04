public boolean sameStarChar(String str) {
    int n = str.indexOf("*");
    Boolean b = true;
    if (n == -1) {
	return true;
    } else {
	for (int i = str.indexOf("*"); i >= 0; i = str.indexOf("*", i + 1)) {
	    if ((n == 0) || ((n + 1) == str.length())) {
		b = true;
	    } else {
		String a = str.substring(i - 1, i);
		String c = str.substring(i + 1, i + 2);
		if (a.equals(c)) {
		    b = true;
		} else {
		    return false;
		}
	    }
	}
	return b;
    }
}