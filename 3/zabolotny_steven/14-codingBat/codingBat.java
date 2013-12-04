public class codingBat {
    public boolean sameStarChar(String str) {
	for(int n=1;n<str.length()-1;n++) {
	    if (str.substring(n,n+1).equals("*"))
		if (!(str.substring(n-1,n).equals(str.substring(n+1,n+2))))
		    return false;
	}
	return true;
    }

    public String sameEnds(String string) {
	int mid = 0;
	if (string.length() % 2 == 0)
	    mid = string.length()/2;
	else
	    mid = (string.length()-1)/2;
	for(int n=mid;n>0;n--) {
	    if (string.substring(0,n).equals(string.substring(string.length()-n,string.length())))
		return string.substring(0,n);
	}
	return "";
    }
}