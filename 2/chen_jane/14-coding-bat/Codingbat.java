public class Codingbat {

    public boolean sameStarChar(String str) {
	for (int i = 0; i < str.length()-1; i++) {
	    if (i != 0 && str.substring(i,i+1).equals("*")) {
		if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
		    return false;
		}
	    }
	}
	return true;
    }

    public String sameEnds(String string) {
	int front,end;
	if (string.length()%2 == 1) {
	    front = string.length()/2;
	    end = (string.length()/2) + 1;
	}
	else {
	    front = end = string.length()/2;
	}
  
	String result = "";
	while (front > 0) {
	    if (string.substring(0,front).equals(string.substring(end))) {
		return string.substring(end);
	    }
	    else {
		front = front - 1;
		end = end + 1;
	    }
	}
	return result;
    }

}
