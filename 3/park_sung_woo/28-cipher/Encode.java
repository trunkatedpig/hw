public class Encode{

    public String encode(String s, int a){
        String word = "";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            c = (char)((int)c + a);
            if ((int)c > (int)'z'){
                c = (char)((int)c - 26);
            }
            word = word + c;
        }
        return word;
    }
}
