public class Practice{

    public boolean sameStarChar(String str) {
	int n,x;
	boolean test = true;
	while((str.length() > 0)&(test == true )){
	    n = str.indexOf("*");
	    x = str.length() + 1;
	    if ((n != 0)&&(n != x)){
		if (str.charAt(n-1)==str.charAt(n+1)){
		    str = str.substring(n);
		}else{
		    test = false;
		}
		str = str.substring(n);
	    }
	}
	    return test;
    }
}
