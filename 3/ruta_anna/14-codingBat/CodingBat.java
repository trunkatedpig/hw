import java.io.*;
import java.util.*;

public class CodingBat {

/*Returns true if for every '*' (star) in the string,
if there are chars both immediately before and after
the star, they are the same. */
public boolean sameStarChar(String str) {
 int len = str.length() - 1;
   for (int i = 1; i < len; i++) {
      if (str.charAt(i) == '*') {
         if (str.charAt(i-1) != str.charAt(i+1)) {
            return false;
         }
      }
   }
   return true;
}


/*Given a string, return the longest substring that appears
at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".*/
public String sameEnds(String string) {
   String result = "";
   int len = string.length();
   int i;
   if (len % 2 == 1) {
      i = len / 2;
      len = i + 1;
   } else {
      i = len / 2;
      len = i;
   }
   for(; i >= 1; i--, len++) {
      result = string.substring(0, i);
      if(result.equals(string.substring(len))) {
         return result;
      }
   }
   return "";
}

}

