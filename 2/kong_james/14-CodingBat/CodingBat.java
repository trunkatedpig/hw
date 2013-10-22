public boolean sameStarChar(String str) {
    for (int a = 1; a < str.length() - 1; a++ )//starting at beginning
	if (str.substring(a,a+1).equals("*")){//finds asterisk
	    if (!str.substring(a-1,a).equals(str.substring(a+1,a+2))){//compares the characters before and after the asterisk
	     return false;
	 }      
	 
	 
     }
 return true;
}

public String sameEnds(String string) {
    String a = "";
    for ( int b = 0; b <= string.length()/2;b ++){//b is the first half
	for (int c = string.length()/2; c<string.length();c ++){//c is second half
	    if (string.substring(0,b).equals(string.substring(c))){//compares both
		a = string.substring(0,b);//adds common characters into the String a
      }
    }
  }
  return a;
}
