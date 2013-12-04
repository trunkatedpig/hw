import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	StringStuff test = new StringStuff();
	System.out.println(test.capitalize("mike zamansky"));
	System.out.println(test.capitalize("brian sapozhnikov"));
	System.out.println(test.bondify("James Bond"));
	System.out.println(test.bondify("Brian Sapozhnikov"));
	System.out.println(test.pigLatinify("word"));
	System.out.println(test.pigLatinify("office"));
	System.out.println(test.pigLatinify("channing"));
	System.out.println(test.pigLatinify("Shoot"));

    }
}
