public int i;
public boolean sameStarChar(String str) {
    for (i=1;i<str.length()-1;i++){//took some guesswork
	if (str.substring(i,i+1).equals("*")) {
	    if (!str.substring(i-1,i).equals(str.substring(i+1,i+2)))//i tried another solution where it would return true but that would just return true if any * had two same characters, not all of them
		{ return false;}
      
	} }
    return true; 
}
public String sameEnds(String string) {
    String res = "";
    for (int i=0;i<=string.length()/2;i++){
	for (int j=string.length()/2;j<string.length();j++){
	    if (string.substring(0,i).equals(string.substring(j))){
		res=string.substring(j);
        
	    }}}
    return res;
}
