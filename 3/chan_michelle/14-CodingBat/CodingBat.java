public boolean sameStarChar(String str) {
  for (int i = 1; i < str.length()-1; i++){
      if (str.substring(i,i+1).equals("*")){
        if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))){
           return false;
           }
         }
       }
          return true;
   }


public String sameEnds(String string) {
  String ans = "";
  for (int i = 0; i <= string.length()/2; i++){
     for (int j = string.length()/2; j < string.length(); j ++){
        if (string.substring(0,i).equals(string.substring(j))){
          ans = ans + string.substring(j);
          }
      }
   }
      return ans;
}

