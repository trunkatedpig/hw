public class Cipher {
    public String rotate(String word, int r){
        s=s.toLowerCase();
        String result = "";
        for(int i=0;i<word.length();i++){
            if ((word.charAt(i)<'a')||(word.charAt(i)>'z'))
                result = result + word.charAt(i);
            else
		{
		    if (s.charAt(i)+r<='z')
			result = result + (char)(word.charAt(i)+r);
		    else
			result = result + (char)('a'+(r-('z'+1-word.charAt(i))));
		}
        }
        return temp;
    }
}