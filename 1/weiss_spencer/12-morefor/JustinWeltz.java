// worked with Jacob/Coby Goldberg

import java.io.*;
import java.util.*;

public class JustinWeltz {
        public String diag(int n){
                String ans = "";
                for (int x = 0; x < n; x++){
                        for (int q = x; q > 0; q--){
                                ans += "  ";
                        }
                        ans += "*" + "\n";
                }
                return ans;
        }

        public String diagWord(String w){
                String out = "";
                int x = w.length()-1;
                for (; x >= 0; x--){
                        out = w.substring(x, x+1) + out;
                        for (int q = x; q > 0; q--){
                                out = "  " + out;
                        }
                        out = "\n" + out;
                }
                return out;
        }

        public String fence(int h, int w){
                String out = "+";
                for (int v = h-2; v > 0; v--){
                        out += "-";
                }
                out += "+" + " \n";
                for (int v = w-2; v > 0; v--){
                        out += "|";
                        for (int l = h-2; l > 0; l--){
                                out += " ";
                        }
                        out += "|";
                        out += "\n";
                }
                out += "+";
                for (int v = h-2; v > 0; v--){
                        out += "-";
                }
                out += "+";
                return out;
       }
}
