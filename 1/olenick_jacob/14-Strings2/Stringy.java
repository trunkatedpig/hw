public class Stringy {

    public String sameEnds(String string) {
	String result = "";
	for (int x = (int)(string.length()/2); x >= 0; x--) {
	    if (string.substring(0, x).equals(string.substring(string.length()-x))){
		result = string.substring(0,x);
		break;
	    }
	}
	return result;  
    }
    public boolean sameStarChar(String str) {
	boolean result = true;
	for (int i = 1; i < str.length()-1; i ++) {
	    if (str.charAt(i) == '*') {
		if ((str.charAt(i-1) == str.charAt(i+1)) && result) {
		    result = true;
		}
		else {
		    result = false;
		}
	    }
	}
	return result;
    }
}
