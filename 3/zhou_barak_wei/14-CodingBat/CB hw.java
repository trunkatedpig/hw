
//Barak Zhou pd 3

public boolean sameStarChar(String str) {
	boolean result = false;
	if (str.length() < 3) result = true; //there can't be a comparison here
	if (!str.contains("*")) result = true; //there's no * to check
	else {
		for (int i=1;i<str.length()-1;i++) {
			if (str.charAt(i)=='*') {
				if (str.charAt(i-1) == str.charAt(i+1)) {
					result = true;
				}
				if (str.charAt(i-1) != str.charAt(i+1)) {
					result = false;
				}
			}
		}
	}
	return result;
}

public String sameEnds(String string) {
    String result = "";
    for(int i = string.length()/2; i > 0; i--){  //compares the two ends to add them together
		if(string.substring(0, i).equals(string.substring(string.length() - i, string.length()))){
			result = result + string.substring(0, i);
			break;
		}
    }
    return result;
}