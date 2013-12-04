public class CodingBat{

public String sameEnds(String string) {
  String Z = "";
  int a;
  int b = 1;
  for (a=string.length(); b <= a -1 ; b++){
       if (string.substring(a-1, a).equals(string.substring(b, b + 1)))
            Z = Z + string.charAt(b);
            }
        return Z;
      
           
       
}
public boolean sameStarChar(String str) {
  int a = str.indexOf("*");
  if (str.substring(a) == 0)
  else if (str.substring(a-1, a).equals(str.substring(a + 1, a +2))){
       return true;
     }

  else{
       return false;
       }
     
  
}
}
    //Neither of these are running perfectly and i dont really know why
    // hopefully my confusion will be resolved when we go over this
