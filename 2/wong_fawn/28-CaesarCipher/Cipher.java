import java.io.*;
import java.util.*;

public class Cipher {
    public String rotate(String str, int r){

        str = str.toLowerCase();
        String retStr = "";

        for(int i = 0; i < str.length(); i++) {       
            if ((str.charAt(i) < 'a') || (str.charAt(i) > 'z')){
                retStr += str.charAt(i);
            }
            else {
                if (str.charAt(i) + r <='z')
                    retStr += (char)(str.charAt(i)+r);
                else
                    retStr += (char)('a'+(r - ('z' + 1 - str.charAt(i))));
            }
        }
        return retStr;
    }
}