public class codingBat {

public boolean sameStarChar(String str) {
  if (str.indexOf("*") == 0) {
  str = str.substring(1,str.length());}
  
  if (!(str.contains("*"))) {return true;}
  
  int star = str.indexOf("*");
  if (str.substring(star-1,star) == str.substring(star+1,star+2)) {
  return true;
  }
  else {
  return false;
  }
  
}

  public String sameEnds(String string) {
     int counter;
     int len = string.length();
     String result = "";
     for(counter = len/2; counter > 0; counter--){
     if(string.substring(0,counter).equals(string.substring(len - counter, len))){
     result += string.substring(0, counter);
     break;
    }}
    return result;
    }

}
