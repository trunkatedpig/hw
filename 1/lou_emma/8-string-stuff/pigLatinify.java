//Spencer, I think the code we wrote in class is in your account, so you'll need to putty them onto github. Meanwhile, this is all
//I can remember so far. 


//Spencer Weiss, Emma Lou- Period 1
import java.io.*;
import java.util.*;

public class pigLatinify{
	public String pigLatin(String word){
		word.toLowerCase();
		String s1=word.substring(0,1);
		if (s1.equals("a")||s1.equals("e")||s1.equals("i")||s1.equals("o")||s1.equals("u")){
			return word+"ay";
		}
		else {
			return word.substring(1)+s1+"ay";
		}
	}
}