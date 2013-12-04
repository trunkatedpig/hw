
//http://codingbat.com/prob/p194491

public boolean sameStarChar(String str) {
  int x;
  for(x=1; x < str.length()-1; ++x){
    if(str.charAt(x) == "*"){
      if(str.charAt(x-1) == str.charAt(x+1)){
      }
      else {
      return false;
      }
    }
  }
  return true;
}



//http://codingbat.com/prob/p131516
public String sameEnds(String string) {
    String result = "";
    int length = string.length();
    for (int i = 0; i <= length / 2; i++)
        for (int x = length / 2; x < length; x++)
            if (string.substring(0, i).equals(string.substring(x)))
                result = string.substring(0, i);
    return result;
}

