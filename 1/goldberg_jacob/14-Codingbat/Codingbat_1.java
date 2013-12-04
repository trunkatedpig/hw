/* Doesn't translate from coding bat for some reason, but it works there*/
public class Codingbat_1{
    public boolean sameStarChar(String str) {
	String b = "";
	int x = str.indexOf("*");
	if (x == -1)
	    return true;
	String a;
	if (x == 0){
	    b = str.substring(1);
	    return sameStarChar(b);
	}
	if (x == str.length()-1) {
	    b = str.substring(0,str.length()-1);
	    return sameStarChar(b);
	}
	else {
	    a = str.substring(x+1, x+2);
	    if (a.equals(str.substring(x-1, x))){
		b = str.substring(x+1);
		return sameStarChar(b);
	    }
	    else
		return false;
	}
    }
    public String sameEnds(String string){
    int  m = string.length();
	if (m % 2 == 0) {
	    int w = m / 2;
	    for (int i = m / 2; i > 0; i--) {
		if (string.substring (0, i).equals(string.substring (w, m))){
		    return (string.substring (0, i) );
		}
		w = w + 1;
	    }
	    return "No matches";
	}
	else {
	    int w = (m + 1) / 2;
	    for (int i = (m - 1) / 2; i > 0; i --) {
		if (string.substring (0,i).equals (string.substring (w, m))){
			return string.substring (0,i);
		    }
		    w = w + 1;
	    }
	    return "No matches";
	}
    }
}
