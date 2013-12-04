import java.io.*;
import java.util.*;



public class CodingBat{

public boolean sameStarChar(String str) {
        for (int i = 1;i<str.length()-1;i++) {
            if (str.substring(i,i+1).equals("*")) {
                if (!str.substring(i-1,i).equals(str.substring(i+1,i+2)))
                    return false;
            }
        }
        return true;
    //used andrew lee's code, still confused on how to do this
    //was originally doing it in a very round about and confusing way
    //ask about tomorrow
  
  
}

    //understand, still had to refer to andrew lee's code, but makes more
    //sense than the other one 
 public String sameEnds(String string) {
        String result = "";
        for (int begin = 0;begin<=string.length()/2;begin++)
            for (int back = string.length()/2;back<string.length();back++)
                if (string.substring(0,begin).equals(string.substring(back)))
                    result = string.substring(0,begin);
        return result;
    }


}
