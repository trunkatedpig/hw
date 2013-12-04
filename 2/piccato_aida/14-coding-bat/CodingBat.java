
public class CodingBat {
    public boolean sameStarChar(String str) {
	if (str.equals("")) {
	    return true;
	}
	for (int i = 1; i < str.length()-1; i++) {
	    if (str.substring(i,i+1).equals("*")) {
		String a = str.substring(i-1,i);
		String b = str.substring(i+1,i+2);
		if (a.equals(b) == false){
		    return false;
		}
	    }
	}
	return true;
    }

    public String sameEnds(String string) {
	String s = "";
	if (string.length() < 2) {
	    return "";
	}
	int k = string.length()/2;
	for (int i = 0;i <= string.length();i ++){
	    for (int j = k; j < string.length(); j++) {
		if (string.substring(0,i).equals(string.substring(j))) {
		    s = string.substring(0,i);
		}
	    }
	}
	return s;
  
    }

}
