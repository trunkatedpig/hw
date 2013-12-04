public class Things {
   
    public String sameEnds(String string) {
	for (int i = string.length() / 2; i > 0; i--) {
	    if (string.substring(0,i).equals(string.substring(string.length()-i, string.length())))
		return string.substring(0,i);
	}
	return "";
    }
    
    public boolean sameStarChar(String str) {
	for (int i = 1; i < str.length()-1; i++) {
	    if (str.charAt(i) == "*".charAt(0) && str.charAt(i-1) != str.charAt(i+1)) 
		return false;
	}
	return true;
    }
}