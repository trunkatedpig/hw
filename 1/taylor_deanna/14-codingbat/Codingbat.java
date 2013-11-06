import java.io.*;
import java.util.*;

public class Codingbat{
  public boolean sameStarChar(String str) {
  boolean value = false;
  int l = str.length();
  if (str.equals("") || str.equals("*") || !str.contains("*") || str.equals("**")){
     value = true;
     }
  else {
     for (int i = 1; i < l; i++){
        if (str.substring(i,i+1).equals("*")){
           if (i==1){
              continue;
              }
           else if (str.substring(i-1,i).equals(str.substring(i+1,i+2))){
                 value = true;
              }
           else if (i == l-1){
                value = true;
                }
           else value = false;
           }
         }
        }
      return value;
    }
    // couldnt get cases with * at end
 
  public String sameEnds(String string) {
  String ans = "";
  for (int i=0; i<string.length()/2; i++)
     for (int j=string.length()/2; j<=string.length(); j++)
        if (string.substring(0,i).equals(string.substring(j)))
           ans = string.substring(0,i);           
   return ans;
  } // really unsure why this doesnt work for some cases.
}
