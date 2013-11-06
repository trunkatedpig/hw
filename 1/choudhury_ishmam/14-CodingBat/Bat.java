import java.io.*;
import java.util.*;

public class CodeBat {

 public boolean sameStarChar(String str) {
        boolean result = true;
        int i = 1;
        while (i<str.length()-1) {
            if (str.substring(i,i+1).equals("*")) {
                if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
                    result = false;
                }
            }
            i = i + 1;
        }
        return result;
    }

public String sameEnds(String string) {
        int l = 1;
        int x = string.length();
        int cntr = 1;
        String result = "";
        while (l <= x/2 ) {
            if (string.substring(0,l).equals(string.substring(x-cntr))) {
                result = string.substring (0,l);
            }
            l = l + 1;
            cntr = cntr + 1;
        }
        return result;
    }

}