public boolean sameStarChar(String str){
    for (int a=1;a<(str.length()-1);a++){
	String p=str.substring(a-1,a);
	String c=str.substring(a,a+1);
	String n=str.substring(a+1,a+2);
	if (c.equals("*")){
		if (!(p.equals(n)))
		    return false;
	    }
    }
    return true;
}

public String sameEnds(String string){
    int b = string.length();
    for (int a = b/2;a>0;a--){
	if (string.substring(0,a).equals(string.substring(b-a,b)));
	    return string.substring(0,a);
    }
    return "";
}
