//still needs work
//after a while I still couldn't get the functions to work for every case
public class codingbat1{
public boolean sameStarChar(String str) {
  for (int i = 0; i < str.length(); i++){
       if (str.substring(i,i + 1) == "*"){
           if (str.substring(i-1,i) == str.substring(i+1,i+2))
           {
           return true;
           }
       }
   }
   return false;

       
           
   }
public String sameEnds(String string) {
  String answer = "";
  int length = string.length() - 1;
  for (int i = 0; i< length; i++){
      if (string.substring(0, i) == string.substring( length- 1, length))
      {
      answer = string.substring(0,i);
      }
      else 
      {
      return answer;
      }
  }
  return answer;
}

