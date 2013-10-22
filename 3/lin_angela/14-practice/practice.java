public boolean sameStarChar(String str) {
  int len = str.length();
  int base = 1;
  String ans = "";
  while (base < len-1){
    if (str.substring(base,base+1).equals("*")){
      if (str.substring(base - 1,base).equals(str.substring(base + 1,base+2))== false){
        ans += "f";
    }
  }
  base ++;
  }

  if (ans.length() > 0){
   return false;
  }
  else{
   return true;
  }
}


public String sameEnds(String string){
    int midIndex;
    int checker;
    String retS= "";
    int index=0;
    if (string.length()%2 == 0)
	midIndex = (string.length()/2);
    else 
	midIndex = string.length()-1/2;
    while (string.substring(index, index+1).equals(string.substring(midIndex,midIndex+1)) == false && midIndex <= string.length())
	   midIndex = midIndex +1;
	   while (string.substring(0,1).equals(string.substring(midIndex,midIndex+1)) == true && midIndex <= string.length() && index <= string.length()/2 ) {
					       retS = retS + string.substring(index, index+1);
					       index = index + 1;
	   }
	   return retS;
}








