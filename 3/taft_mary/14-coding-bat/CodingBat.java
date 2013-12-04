public class CodingBat {

    //Problem from http://codingbat.com/prob/p194491
    //Instructions: Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
    public boolean sameStarChar(String str) {
	int f, l;
	String temp;
	for(f = 0, l = 3; l <= str.length(); f++, l++) {
	    temp = str.substring(f,l);
	    if (temp.substring(1,2).equals("*")) {
		if (!temp.substring(0,1).equals(temp.substring(2)))
		    return false;
	    }
	}
	return true;
    }

    //Problem from http://codingbat.com/prob/p131516
    //Instructions: Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
    public String sameEnds(String string){
	int  len = string.length(), end1, begin2;
	if (len % 2 == 0) {
	    begin2 = len / 2;
	    end1 = len / 2;
	} else {
	    begin2 = (len + 1) / 2;
	    end1 = (len - 1) / 2;
	}
	for (; end1 > 0; end1--, begin2++) {
	    if (string.substring (0, end1).equals(string.substring (begin2, len)))
		return (string.substring (0, end1) );
	}
	return "";
    }

}
