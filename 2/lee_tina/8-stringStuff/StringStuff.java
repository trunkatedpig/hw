import java.io.*;
import java.util.*;

public class StringStuff {
    
    public String stringCap(String n) {
	String temp;
	int index;
	temp = n.substring(0,1).toUpperCase();
	index = n.indexOf(" ");
	temp = temp + n.substring(1,index + 1);
	temp = temp + n.substring(index + 1,index + 2).toUpperCase();
	temp = temp + n.substring(index + 2);
	return temp;
    }

    public String bondify(String n) {
	String temp;
	String first;
	String last;
	int index;
	/*temp = n.substring(0,1).toUpperCase();
	index = n.indexOf(" ");
	first = temp + n.substring(1,index + 1);
	temp = n.substring(index + 1,index + 2).toUpperCase();
	last = temp + n.substring(index + 2);*/
	StringStuff t = new StringStuff();
	temp = t.stringCap(n);
	index = n.indexOf(" ");
	first = temp.substring(0,index + 1);
	last = temp.substring(index + 1);
	temp = last +  ", " + first + last;
	return temp;
    }

//Danny Qiu and Tina Lee
    public String pigLatinfy(String sentence) {
        String first, second, third, fourth;
        first = sentence.substring(0,1);
        second = sentence.substring(1,2);
        third = sentence.substring(2,3);
        fourth = sentence.substring(3,4);
        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") || first.equals("y")) {
            sentence = sentence + "way";
        }
        else if (second.equals("a") || second.equals("e") || second.equals("i") || second.equals("o") || second.equals("u")) {
            sentence = sentence.substring(1) + sentence.substring(0,1) + "ay";
        }
        else if (third.equals("a") || third.equals("e") || third.equals("i") || third.equals("o") || third.equals("u")) {
            sentence = sentence.substring(2) + sentence.substring(0,2) + "ay";
        }
        else if (fourth.equals("a") || fourth.equals("e") || fourth.equals("i") || fourth.equals("o") || fourth.equals("u")) {
            sentence = sentence.substring(3) + sentence.substring(0,3) + "ay";
        }
        return sentence;
    }
}
