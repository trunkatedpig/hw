import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Cipher c = new Cipher();
	Encrypt e = new Encrypt();
	System.out.println(c.decode(e.encode("This is a medium sized string that will be decoded after being encoded",7)));
	System.out.println(c.decode(e.encode("Short stuff",11)));
	System.out.println(c.decode(e.encode("Pretty cool how this makes a twenty-six spaced vector to determine the space between the frequency of letters in a work of literature with what is either english or gibberish",4)));
    }
}
