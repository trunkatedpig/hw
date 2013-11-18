import java.io.*;
import java.util.*;

public class pigLatin {

    private String ans;
    public String vPigLatin (String word) {
        return word + "ay";
    }

    public String runPigLatin (String word) {
        if (word.substring(0,1).equals("a")
	    || word.substring(0,1).equals("A")
	    || word.substring(0,1).equals("e")
	    || word.substring(0,1).equals("E")
	    || word.substring(0,1).equals("i")
	    || word.substring(0,1).equals("I")    
	    || word.substring(0,1).equals("o")
	    || word.substring(0,1).equals("O")
	    || word.substring(0,1).equals("u")
	    || word.substring(0,1).equals("U")){
	    ans = word + "ay";
	}
	else if (word.substring(0,2).equals("ch")
		 || word.substring(0,2).equals("Ch")
		 || word.substring(0,2).equals("sh")
		 || word.substring(0,2).equals("Sh")
		 || word.substring(0,2).equals("ph")
		 || word.substring(0,2).equals("Ph")
		 || word.substring(0,2).equals("rh")
		 || word.substring(0,2).equals("Rh")
		 || word.substring(0,2).equals("zh")
		 || word.substring(0,2).equals("Zh")){
	    ans = word.substring(2) + word.substring (0,2) + "ay";
	}
	else {
	    ans = word.substring(1)+word.substring(0,1) + "ay";
	}

	return ans;
    }
}
