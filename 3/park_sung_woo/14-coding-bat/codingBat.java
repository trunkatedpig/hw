public boolean sameStarChar(String str) {
  int star;
  boolean ans = false;
  star = str.indexOf("*");
  while (star >= 0){
    if (str.substring(star-1,star).equals(str.substring(star+1,star+2))){
      ans = true;
    }else{
      ans = false;
    }
    str = str.substring(star+1);
    star = str.indexOf("*");
  }
  return ans;
}

public String sameEnds(String string) {
  String ans ="";
  String first;
  String last;
  int counter = 1;
  first = string.substring(0,1);
  last = string.substring(string.length()-1,string.length());
  while (first.equals(last)){
    ans = first;
    counter ++;
    first = string.substring(0,counter);
    last = string.substring(string.length()-counter,string.length());
  }
  return ans;
}
