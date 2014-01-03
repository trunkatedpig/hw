import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	System.out.println(rotate("hello",3));
	System.out.println(rotate("the quick brown fox",12));
	System.out.println(rotate("the qiuck borwn fx",12));
    }

    public static char rotate(char c, int shift){
	c = Character.toLowerCase(c);
	c = (char)((c + shift - 97)%26 + 97);
	return c;
    }

    public static String rotate(String s, int shift){
	String result = "";
	for (int i = 0; i < s.length(); i ++){
	    char c = Character.toLowerCase(s.charAt(i));
	    if (c > 96 && c < 96+26){
		result = result + rotate(c,shift);
	    }
	    else {
		result = result + c;
	    }
	}
	return result;
    }
}