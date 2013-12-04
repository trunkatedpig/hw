public class Bat {

    public boolean sameStarChar(String str) {
	boolean result = true;
	int i = 1;
	while (i<str.length()-1) {
	    if (str.substring(i,i+1).equals("*")) {
		if (! str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
		    result = false;
		}
	    }
	    i = i + 1;
	}
	return result;
    }

    public String sameEnds(String string) {
	int len = 1;
	int x = string.length();
	int counter = 1;
	String result = "";
	while (len <= x/2 ) {
	    if (string.substring(0,len).equals(string.substring(x-counter))) {
		result = string.substring (0,len);
	    }
	    len = len + 1;
	    counter = counter + 1;
	}
	return result;
    }


}
