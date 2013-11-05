public class CodingBat{
    public boolean sameStarChar(String str) {
	int i = str.indexOf("*");
	if (str.equals("")){
	    return true;
	}
	if (i == -1){ 
	    return false; 
	}
	else if (i == 0){
	    return sameStarChar(str.substring(1));
	}
	else {
	    String left = str.substring(i-1,i);
	    String right = str.substring(i+1,i+2);
	    if (left.equals(right)){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }

    // you need a warriors come out to play method in the warrior class in order to pay homage to the 1979 american cult classic film 'The Warriors' and also the Wu Tang clan use that line in a song so clearly its as appropriate, if not infinitely more so, than anything else you could put as a method name. 