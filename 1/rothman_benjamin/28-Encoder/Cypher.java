public class Cypher {

    private String result;

    public String encoder (String s, int i) {

	result = s;

	result.toLowerCase();

	String temp = "";
	
	for (int n = 0; n < result.length(); n++) {

	    if (result.charAt (n) < 'a' || result.charAt (n) > 'z') {

		temp = temp + result.charAt (n);
	    }

	    else {
		if (result.charAt (n) + i <= 'z') {

		    temp = temp + (char)( result.charAt (n) + i);
		}

		else {
		    temp = temp + (char) ('a' + (i - ('z' + 1 - result.charAt (n) ) ) );
		   
	   
	}
	    }

	}

    

	result = temp;
	
	return result;

    }

}
