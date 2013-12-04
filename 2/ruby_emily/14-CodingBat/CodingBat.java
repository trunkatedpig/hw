public boolean sameStarChar(String str) {
  int i;
  for (i=0;i<str.length()-1;i++){
      if (str.substring(i,i+1).equals("*")&& i!=0){
         if(str.substring(i-1,i).equals(str.substring(i+1,i+2))){
            return true;
            }
         }
      }
  return false;
     
}

public String sameEnds(String s) {
  int i;
  String line="";
  for (i=0;i<s.length();i++){
      if (s.substring(i,i+1).equals(s.substring(s.length()-i))){
         line=line+s.substring(i,i+1);
         }
      }
  return line;
      
}
//not enough time to finish, realize last one is incomplete//
