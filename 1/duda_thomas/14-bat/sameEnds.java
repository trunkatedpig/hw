public String sameEnds(String string) {
    int n = 0;
    int m = 0;
    for (int i = string.length() / 2; i > 0; i--) {
	if ((string.length() / 1.0) % 2 != 0.0) {
	    n = 1;
	}
	if (string.substring(0,i).equals(string.substring(n+i+m))) {
	    return string.substring(0,i);
	}
	m = m + 2;
    }
    return "";  
}
