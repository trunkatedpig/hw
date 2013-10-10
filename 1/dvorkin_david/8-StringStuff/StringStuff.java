import java.io.*;
import java.util.*;

public class StringStuff {

    private String name;

    private String word;

    public StringStuff(){}

    public StringStuff (String name){
        this.name = name;
    }

    public String capitalize (String name){
        String result1 = "";
        String result2 = "";
        result1=name.substring(0,1).toUpperCase() + name.substring(1, name.indexOf(" ") + 1);
        result2=name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase()+name.substring(name.indexOf(" ") + 2);
        return result1 + result2;
    }

    public String bondify (String name){
        String bond = capitalize (name);
        String result1 = "";
        String result2 = "";

        result2=name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase()+name.substring(name.indexOf(" ") + 2);
        return result2+", "+bond;
    }

    public String PigLatinify(String word){
        String first = "";
        String second = "";
        String firstLetter = word.substring(0,1);
        if (!firstLetter.equals("a") && !firstLetter.equals("e") && !firstLetter.equals("i") && !firstLetter.equals ("o") && !firstLetter.equals ("u")){
            first = word.substring(0,1) + "ay";
            second = word.substring(1);
            if (word.substring(0,2).equals("ch") || word.substring(0,2).equals("th") || word.substring(0,2).equals("sh")){
                first =  word.substring(0,2) + "ay";
                second = word.substring(2);
            }        }
        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")){
            first = firstLetter + "y";
            second = word.substring(1);}
        return second + first;
    }
}
