public class encode {      
    public String e(String s, int offset) {
	String cyphered = "";
	s = s.toLowerCase();

	for (int i = 0;i < s.length();i++) {
	    int charAt = (int)s.charAt(i);

	    if (charAt != 95) {
		if ((charAt + offset) > 122) {
			charAt = 97 + charAt + offset - 122;
			cyphered = cyphered + (char)charAt;
		    }
	    }
	    else {
		cyphered = cyphered + ' ';
	    }
	}
	return cyphered;
    }
}

		   
