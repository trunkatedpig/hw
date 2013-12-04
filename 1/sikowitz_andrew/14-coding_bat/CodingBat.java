public class CodingBat {

    public boolean sameStarChar(String str) {
	boolean valid = true;
	int newIndex = 0;
	int x;

	while (str.substring(newIndex).contains("*")) {
	    x = str.substring(newIndex).indexOf("*") + newIndex;
	    if (x != 0 && x != str.length()-1)
		valid = str.substring(x-1,x).equals(str.substring(x+1,x+2));
	    if (!valid)
		return false;
	    newIndex = x+1; //Sets new index to look for next *
	}
  
	return true;
    
    }

    public String sameEnds(String string) {
	int l = string.length();
	int index = l / 2;
  
	while (index > 0) {
	    if (string.substring(0, index).equals(string.substring(l-index)))
		return string.substring(0, index);
	    else
		index--;
	}
  
	return "";
    }
}
